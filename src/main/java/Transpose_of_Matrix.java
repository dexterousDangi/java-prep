
public class Transpose_of_Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 4, 46, 6 }, { 5, 6, 46 }, { 5, 4, 5 } };
		int row = matrix[0].length;
		System.out.println("no. of rows" + row);
		int column = matrix.length;

		System.out.println("no of columns " + column);

		System.out.println("given matrix :");
		for (int[] mat : matrix) { // will give us row
			for (int matr : mat) { // will provide corresponding column of the array

				System.out.format("%-3d", matr);
			}
			System.out.println();
		}

		int[][] transpose = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		System.out.println("transpose of given matrix: ");

		for (int[] trans : transpose) {
			for (int transpos : trans) {
				System.out.format("%- 3d", transpos);
			}
			System.out.println();
		}
	}
}