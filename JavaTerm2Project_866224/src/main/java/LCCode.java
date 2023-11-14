
public class LCCode {
	public static void main(String[] args) {
		int num[] = { 1,2,2 };

		System.out.println("Count: " + candy(num));
	}

	public static int candy(int[] ratings) {
		int candiesCount = 0;
		int candies[] = new int[ratings.length];
		
		for(int i=0;i<ratings.length;i++) {
			if (candies[i] == 0) {
				candies[i] = 1;
			}
		}
		for (int i = 0; i < ratings.length - 1; i++) {
			
			if (ratings[i] < ratings[i + 1]) {
				candies[i+1] = candies[i]+1;

			}
		}

		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i] < ratings[i - 1] && candies[i] >= candies[i-1]) {
				candies[i - 1] =candies[i]+ 1;

			}
		}
		for (int i : candies) {
			System.out.println("Candi array " + i + " ,");
			candiesCount += i;
		}
		return candiesCount;
	}
}
