
public class Three_dimensional_array {

	public static void main(String[] args) {

		int [][][] alpha= new int [4][3][3];
		
		// printing a 3d array
		for(int i=0;i<4;i++) {   // no of 2-d arrays you want i=4
			for(int j=0;j<3;j++) {   // no of rows in an array
				for(int k=0; k<3;k++) {   // no of column in an array
					alpha[i][j][k]=k+2;
				}
			}
		}
		for(int i=0;i<4;i++) {
			System.out.println("array :"+(i+1));
			for(int j=0;j<3;j++) {
				for(int k=0; k<3;k++) {
					System.out.print(" "+alpha[i][j][k]);
				}System.out.println();
			}System.out.println();
		}
		// printing a 3d array using for-each loop:
		for(int[][] aaa:alpha) {
			for(int []aa:aaa) {
				for(int a:aa) {
					System.out.print(" "+(a+10));
			}System.out.println();
		}System.out.println();
	}

}
}