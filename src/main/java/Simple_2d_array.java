
public class Simple_2d_array {

	public static void main(String[] args) {

		int [][] matrix = {{5,3,6,7},{8,2,4,1},{1,5,8,6}};
		
		for(int i=0; i<matrix.length; i++) {  // will give help us to traverse the rows
	
			for(int j=0; j<matrix[i].length;j++ ) {  // will help us to traverse the corresponding column
				
			System.out.print(matrix[i][j]);
			}
			System.out.println();  // will move to next line after a row is done
		}
		System.out.println();System.out.println();
		// we can also traverse an array using a for-each loop also
		
		for(int[] mat: matrix) {  // will give us row
			for(int matr: mat) {  // will provide corresponding column of the array
				
				System.out.print(matr);
			}
			System.out.println();
		}
	}
}
