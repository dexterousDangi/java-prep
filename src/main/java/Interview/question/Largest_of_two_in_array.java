package Interview.question;

//Q. Write a program to find top two maximum numbers in a array?

public class Largest_of_two_in_array {

	public static void main(String[] args) {
		int num[] = {5,34,99,78,2,45,1,23};
		twoLargest(num);
	  
	}

	private static void twoLargest(int[] num) {
        int max1=0;
        int max2=0;
        int check=0;
		for(int i=0;i<num.length;i++){
         check = num[i];
         
         if(max1<check) {   // here we get the largest no. if this condition is true, make max1= check, and earlier give  max1 value to max2. 
        	 max2=max1;
        	 max1=check;
         }else if(max2<check) {   // in case we get a largest one before the largest second  , we use this  condition
        	 max2=check;
         }         
         }
		System.out.println("largest one "+max1);
		System.out.println("largest second "+max2);
	}

}
