package Interview.question;

// Q. How to find all the leaders in an integer array in java?

public class Leader_in_an_array {
	
	public static void checkLeader(int [] a , int size) {
		 
		for(int i=0; i<size;i++) { // to traverse through the array
			int j;
			for(j=i+1;j<size;j++) {  // to check the greater no. exist on the right side or not if exist then simply break;
				
				if(a[i]<a[j])	
					break;
				
			}
			if(j==size)  // if this condition stays true means it iterated over all the element over the right side and didn't find any greater no. the the current a[i]
				
				System.out.println(a[i] + " is a leader.");  // right most element is always a leader.
		}
	}

	public static void main(String[] args) {
		int [] a= {34,5,23,8,7,3,9};
		checkLeader(a,a.length);
	}

}
