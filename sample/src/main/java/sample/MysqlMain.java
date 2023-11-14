package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MysqlMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice! \n 1. Select \n 2. Insert");
//		int choice = sc.nextInt();
//		if (choice == 1) {
//			selectData();
//		} else if (choice == 2) {
//			insertData();
//		} else {
//			System.out.println("Invalid choice!!");
//		}
		int arr[] = new int [5];

		 System.out.print(arr);
		sc.close();
	}

	/**
	 * Select Data from DB
	 */
	public static void selectData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Scanner sc = new Scanner(System.in);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lambton", "root", "Signity@123");
			System.out.println("Enter the sales ID for which you want to fetch results.");
			int salesID = sc.nextInt();
			// Execute a query
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM sales where SalesID=" + salesID);

			if (!rs.next()) {
				System.out.println("Data in DB is not present for ID: " + salesID);
			} else {
				// Iterate through the result set
				do {
					int empId = rs.getInt("SalesID");
					String firstName = rs.getString("FirstName");
					String lastName = rs.getString("LastName");
					int quantityPurchased = rs.getInt("QuantityPurchased");
					int pricePerItem = rs.getInt("PricePerItem");

					System.out.println("\nEMP ID: " + empId + "\nFirst Name: " + firstName + "\nLast Name: " + lastName
							+ "\nQuantityPurchased: " + quantityPurchased + "\nPricePerItem: " + pricePerItem);
				} while (rs.next());
				sc.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Insert Data in DB.
	 */
	public static void insertData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Scanner sc = new Scanner(System.in);
			// Register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lambton", "root", "Signity@123");
			String insertQuery = "insert into sales(SalesID,FirstName,LastName,QuantityPurchased,PricePerItem) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
			System.out.println("Enter the id  (integer type) :");
			preparedStatement.setInt(1, sc.nextInt());
			System.out.println("Enter the first name (string type) :");
			preparedStatement.setString(2, sc.next());
			// sc.nextLine(); // consume newline character left in the input stream
			System.out.println("Enter the last name (string type) :");
			preparedStatement.setString(3, sc.next());
			System.out.println("Enter the quantity purchased (int type) :");
			preparedStatement.setInt(4, sc.nextInt());
			System.out.println("Enter the price per item (float/decimal type) :");
			preparedStatement.setDouble(5, sc.nextDouble());
			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("Data inserted successfully..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			/**
			 * Close DB connections
			 */
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}