package Interview.question;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoArrayContainsSameElement {

	public static void main(String[] args) {
		 Integer [] num1= {1,2,3,2,1};
		 Integer [] num2= {2,3,1,1};
		 Integer [] num3= {1,2,3,4};
		 
		 System.out.println(sameElements(num1,num2));
		 System.out.println(sameElements(num2,num3));
		 System.out.println(sameElements(num3,num1));
	}

	private static boolean sameElements(Integer[] num1, Integer[] num2) {

		HashSet<Object> set1=new HashSet<>(Arrays.asList(num1));
		HashSet<Object> set2=new HashSet<>(Arrays.asList(num2));
		
		if(set1.size()!=set2.size()) {
			
			return false;
		}
		for(Object obj:set1) {
			if(!set2.contains(obj)) {
				return false;
			}		
		}
	
			return true;
	}

}
