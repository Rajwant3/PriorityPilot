import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * This Application will validate user and provide DB operations functionality
 * if user is valid.
 * 
 * @author Rajwant
 *
 */
public class DBOperationApp {
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Rajwant Kaur- Establish connection with database.
		 */
		connectToDatabase();

		int choice = 0;
		int studentId = 0;
		String studentName = "";

		/**
		 * Rajwant Kaur- Ask User to enter their credentials.
		 */
		System.out.println("Please Login with your credentials");
		System.out.print("Enter your student ID: (Numeric Part Only)");

		/**
		 * Iterate user in Loop until they enter valid integer value for studentID
		 */
		while (!scanner.hasNextInt()) {

			System.out.println("Your Student ID must be Integer Type Only!");
			scanner.nextLine();
			System.out.println("Enter Student ID again!");

		}

		/**
		 * If user is not iterating in while loop, it means student ID is an int value
		 * now. Read Student ID in int format only
		 */
		if (scanner.hasNextInt()) {
			studentId = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

		}

		System.out.print("Enter your name: ");
		if (scanner.hasNextLine()) {
			studentName = scanner.nextLine();
		} else {
			System.out.println("You didn't entered a valid name!");
			System.exit(0);
		}

		/**
		 * Give access to application only if user is valid.
		 */
		if (validateStudent(studentId, studentName)) {
			System.out.println("Welcome Student: " + studentName + " under Student ID: " + studentId
					+ ": You are authorized to enter the system");

			while (choice != 5) {
				System.out.println("\nPlease select an option:");
				System.out.println("1. Insert record");
				System.out.println("2. Select a record");
				System.out.println("3. Update record");
				System.out.println("4. Delete record");
				System.out.println("5. Exit");

				/**
				 * Iterate user in Loop until they enter valid integer value for ID
				 */
				while (!scanner.hasNextInt()) {

					System.out.println("Your Choice must be Integer Type Only!");
					scanner.nextLine();
					System.out.println("Enter Choice again!");

				}

				/**
				 * If user is not iterating in while loop, it means choice is an int value now.
				 * Get user Choice Read Data only if integer is entered.
				 */
				if (scanner.hasNextInt()) {
					choice = scanner.nextInt();
					scanner.nextLine(); // Consume the newline character

				}

				switch (choice) {
				case 1:
					/**
					 * Insert new book data in DB.
					 */
					insertRecord();
					break;
				case 2:
					/**
					 * select a book based on its ID
					 */
					selectRecord();
					break;
				case 3:
					/**
					 * update a book title based on its ID
					 */
					updateRecord();
					break;
				case 4:
					/**
					 * Delete a book based on its ID
					 */
					deleteRecord();
					break;
				case 5:
					System.out.println("Exiting Application.");
					break;
				default:
					System.out.println("Invalid choice, enter a value from given list only!!");
					break;
				}
			}
		} else {
			System.out.println(
					"Unauthorised access! Please retry if you are a registered user or contact Admin for registeration!");
		}

		/**
		 * Close DB connections
		 */
		disconnectFromDatabase();
	}

	/**
	 * Create a connection with database.
	 */
	private static void connectToDatabase() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lambton", "root", "Signity@123");
			System.out.println("Application started.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Application can not be started.");
			/**
			 * Exit App if DB connection fails
			 */
			System.exit(0);
		}
	}

	/**
	 * Close DB connections
	 */
	private static void disconnectFromDatabase() {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
				System.out.println("Application terminated.");
			}
		} catch (SQLException e) {
			System.out.println("Error disconnecting from database.");
		}
	}

	private static boolean validateStudent(int id, String name) {
		try {
			pstmt = conn.prepareStatement("SELECT * FROM students WHERE studentid=? AND lower(studentname)=?");
			pstmt.setInt(1, id);
			pstmt.setString(2, name.toLowerCase());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			System.out.println("No Data Found with this  student ID or Name!");
		}
		return false;
	}

	private static void insertRecord() {
		System.out.println("Enter the book record details  to insert: ");

		try {
			pstmt = conn.prepareStatement("INSERT INTO books VALUES (?,?,?,?)");
			System.out.println("Enter the Book id  (integer type) :");

			/**
			 * Iterate user in Loop until they enter valid integer value for ID
			 */
			while (!scanner.hasNextInt()) {

				System.out.println("Boot ID must be Integer Type Only!");
				scanner.nextLine();
				System.out.println("Enter Book ID again!");

			}
			/**
			 * If user is not iterating in while loop, it means ID value is int now.
			 */
			if (scanner.hasNextInt()) {
				int bookID = scanner.nextInt();
				System.out.println("Book id:" + bookID);
				pstmt.setInt(1, bookID);
				scanner.nextLine(); // Consume the newline character

			}
			System.out.println("Enter the Book Title(string type) :");
			if (scanner.hasNextLine()) {
				String title = scanner.nextLine();
				System.out.println("Book title:" + title);
				pstmt.setString(2, title);
			}
			System.out.println("Enter the Book Author(string type) :");
			if (scanner.hasNextLine()) {
				String author = scanner.nextLine();
				System.out.println("Book author:" + author);
				pstmt.setString(3, author);
			}

			System.out.println("Enter the Book current month sales  (integer type) :");

			/**
			 * Iterate user in Loop until they enter valid integer value for Book Current
			 * month sales.
			 */
			while (!scanner.hasNextInt()) {

				System.out.println("Boot current month sales must be Integer Type Only!");
				scanner.nextLine();
				System.out.println("Enter current month sales again!");

			}

			/**
			 * If user is not iterating in while loop, it means value is int now.
			 */
			pstmt.setInt(4, scanner.nextInt());
			scanner.nextLine(); // Consume the newline character

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Book inserted successfully.");
			} else {
				System.out.println("Failed to insert record.");
			}
		} catch (SQLException e) {
			System.out.println("Error inserting record.");
		}
	}

	private static void selectRecord() {

		System.out.print("Enter the ID of the book to view details: ");

		try {
			pstmt = conn.prepareStatement("SELECT * FROM books WHERE BookID=?");
			/**
			 * Iterate user in Loop until they enter valid integer value for ID
			 */
			while (!scanner.hasNextInt()) {

				System.out.println("Boot ID must be Integer Type Only!");
				scanner.nextLine();
				System.out.println("Enter Book ID again!");
			}
			/**
			 * If user is not iterating in while loop, it means ID value is int now.
			 */
			if (scanner.hasNextInt()) {
				int bookID = scanner.nextInt();
				System.out.println("Book id:" + bookID);
				pstmt.setInt(1, bookID);
				scanner.nextLine(); // Consume the newline character
			}
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("Book ID: " + rs.getInt("BookID"));
				System.out.println("Book  Title: " + rs.getString("Title"));
				System.out.println("Book  Author: " + rs.getString("Author"));
				System.out.println("Book  current month sales: " + rs.getString("CurrentMonthSales"));
			} else {
				System.out.println("No Book found with this ID.");
			}
		} catch (SQLException e) {
			System.out.println("Error selecting record.");
		}
	}

	private static void updateRecord() {

		System.out.print("Enter the ID of the book to update: ");
		int bookID = 0;

		try {
			pstmt = conn.prepareStatement("UPDATE books SET Title=? WHERE BookID=?");

			/**
			 * Iterate user in Loop until they enter valid integer value for ID
			 */
			while (!scanner.hasNextInt()) {

				System.out.println("Boot ID must be Integer Type Only!");
				scanner.nextLine();
				System.out.println("Enter Book ID again!");

			}

			/**
			 * If user is not iterating in while loop, it means ID value is int now.
			 */
			if (scanner.hasNextInt()) {
				bookID = scanner.nextInt();
				pstmt.setInt(2, bookID);
				scanner.nextLine(); // Consume the newline character

			}

			System.out.print("Enter the new book for title: ");
			String titleNew = scanner.nextLine();
			pstmt.setString(1, titleNew);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Book Title updated successfully.");
			} else {
				System.out.println("Failed to update book title.");
			}
		} catch (SQLException e) {
			System.out.println("Error updating record.");
		}
	}

	/**
	 * Delete a book based on its ID
	 */
	private static void deleteRecord() {

		System.out.print("Enter the ID of the book you want to delete: ");

		try {
			pstmt = conn.prepareStatement("DELETE FROM books WHERE BookID=?");

			/**
			 * Iterate user in Loop until they enter valid integer value for ID
			 */
			while (!scanner.hasNextInt()) {

				System.out.println("Boot ID must be Integer Type Only!");
				scanner.nextLine();
				System.out.println("Enter Book ID again!");

			}

			/**
			 * If user is not iterating in while loop, it means ID value is int now.
			 */
			if (scanner.hasNextInt()) {
				int bookID = scanner.nextInt();
				System.out.println("Book id:" + bookID);
				pstmt.setInt(1, bookID);
				scanner.nextLine(); // Consume the newline character

			}

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Record deleted successfully.");
			} else {
				System.out.println("Failed to delete record.");
			}
		} catch (SQLException e) {
			System.out.println("Error deleting record.");
		}
	}
}
