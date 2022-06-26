package Interview.question;

import java.util.HashSet;

/**
 * Application to check if string contains only the unique character.
 * add() method in Java HashSet is used to add a specific element into a HashSet. 
 * This method will add the element only if the specified element is not present in 
 * the HashSet else the function will return False if the element is already present in the HashSet.
 */

public class UniqueCharOnly {

	public static void main(String[] args) {
		
		boolean result=false;
		String inputstring="Alve i@wsom";
		System.out.println(inputstring);
		HashSet<Character> uniquecharset=new HashSet<>();
		for(int i=0; i<inputstring.length();i++) {
			result=uniquecharset.add(inputstring.charAt(i));
			if(result==false) {
				break;
			}
		}
		System.out.println(result);
		
	}

}
