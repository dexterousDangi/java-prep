package Interview.question;

import java.util.Arrays;

/**
 * Majority elements means element which comes in the array more than lenght/2 times
 * and more than any other element
 */
public class MajorityElement {

	public static int majorityElement(int [] num) {
		if(num.length==1) {
			return num[0];
		}
		Arrays.sort(num);
		
		int prev=num[0];
		int count =1;
		for(int i=1; i<num.length;i++) {
			if(num[i]==prev) {
				count++;
				if(count>num.length/2) {
				return num[i];
				}
			}else {
				count=1;
				prev=num[i];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
				int [] num= {1,2,2,33,4,3,3,42,4,432,2,2,2,2,2,2,2};
				System.out.println(majorityElement(num));
	}

}
