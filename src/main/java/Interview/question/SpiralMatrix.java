package Interview.question;

public class SpiralMatrix {

	public static void main(String[] args) {

		int n = 6;
		int[][] matrix = generateMatrix(n);

		for (int matr[] : matrix) {
			for (int mat : matr) {
				System.out.print(" "+mat);
			}
			System.out.println();
		}
	}

	private static int[][] generateMatrix(int n) {

		int total = n * n;
		int[][] result = new int[n][n];

		int x = 0;
		int y = 0;

		for (int i = 0; i < total;) {
			while (y < n) {
				i++;
				result[x][y] = 1;
				y++;
			}
			y--;
			x++;
			
			while(x<n) {
				i++;
				result[x][y]=1;
				x++;
			}
			x--;
			y--;

			while (y >= 0 ) {
				i++;
				result[x][y] = 1;
				y--;
			}
			y++;
			x--;

			while (x >= 0) {
				i++;
				result[x][y] = 1;
				x--;
			}
			x++;
			y++;
		}
		return result;

	}

}
