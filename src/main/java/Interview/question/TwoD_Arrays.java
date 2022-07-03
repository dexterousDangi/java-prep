package Interview.question;

public class TwoD_Arrays {

	public static void main(String[] args) {
		int [] 	[] arr= new int[6][6];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;) {
				arr[i][j]=1;
				break;
			}
				
		}
		
		for(int [] arrr: arr) {
			for(int ar: arrr) {
				System.out.print(ar);
			}
			System.out.println();
		}
	}

}
