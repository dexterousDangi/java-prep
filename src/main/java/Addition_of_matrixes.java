import java.util.Scanner;

public class Addition_of_matrixes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m, n, c, d;
		System.out.println("enter the no. of rows for the matrix");
		m = sc.nextInt();
		System.out.println("enter the no. of columns for the matrix");
		n = sc.nextInt();

		int[][] array1 = new int[m][n];
		int[][] array2 = new int[m][n];
		int [][] sum = new int [m][n];
		
		System.out.println("enter the element in the matrix");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				array1[c][d] = sc.nextInt();

			}
		}
		for (int[] arra : array1) {
			for (int arr : arra) {
				System.out.format("%-3d",arr);
			}
			System.out.println();
		}
		System.out.println("enter the second matrix elements");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				array2[c][d] = sc.nextInt();

			}
		}
		for (int[] arra : array2) {
			for (int arr : arra) {
				System.out.format("%-3d",arr);
			}
			System.out.println();
		}
System.out.println("addition of two matrix: ");
		
		for(int i=0; i<m; i++)	{
			for(int j=0; j<n; j++) {
				sum[i][j] = array1[i][j]+array2[i][j];
				
			}
		}
		for(int[] so: sum) {
			for(int sam: so) {
				System.out.format("%-3d",sam);
			}
			System.out.println();
		}
	}

}
