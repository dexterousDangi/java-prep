package Interview.question;

import java.util.Arrays;

/**
 * Given a sorted array and a target value, return the index if target is found. if not, return the index
 * where it would be if it were inserted in order. You may assume no duplicate in the array.
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
			int [] num= {1,23,42,54,434,5345,35345};
			int target=43;
			System.out.println(Arrays.toString(num));
			System.out.println("target: "+target);
	System.out.println("target can be inserted at index: "+searchInsert(num, target));
	
	}

	private static int searchInsert(int[] num, int target) {
		if(num==null)
			return 0;
		
		if(target<=num[0])
			return 0;
		
		for(int i=0;i<num.length-1;i++) {
			if(target>num[i]&&target<num[i+1]) {
				return i+1;
			}
		}
		
		return num.length;
		
	}

}
