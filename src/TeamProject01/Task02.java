package TeamProject01;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only
		 */
		
		int[][] numbers = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 
				{ 20, 21, 22, 23, 24 },
				{ 101, 202, 303, 404, 505, 606, 707, 808, 909, 1000 }, 
		};

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int num = numbers[i][j];
				if (num % 2 == 0) {
					System.out.print(num + "; ");
				}
			}
			System.out.println();
		}
	}

}
