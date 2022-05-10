package Interview.question;

public class Largest_of_two_in_array {

	public static void main(String[] args) {
		int num[] = {5,34,78,2,45,1,99,23};
		twoLargest(num);
	  
	}

	private static void twoLargest(int[] num) {
        int max1=0;
        int max2=0;
        int check=0;
		for(int i=0;i<num.length;i++){
         check = num[i];
         
         if(max1<check) {
        	 max2=max1;
        	 max1=check;
         }else if(max2<check) {
        	 max2=check;
         }         
         }
		System.out.println("largest one "+max1);
		System.out.println("largest second "+max2);
	}

}
