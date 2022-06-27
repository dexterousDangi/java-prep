package Interview.question;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String first,String second) {
		first=first.trim().toLowerCase();
		second=second.trim().toLowerCase();
		if((first.length()!=(second.length()))){
			return false;
		}
		char [] firstArray=first.toCharArray();
		char [] secondArray=second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
				
		return Arrays.equals(firstArray, secondArray);
	}
	public static void main(String[] args) {
		boolean result= isAnagram("not", "ton");
		System.out.println("the words are in anagram in nature: "+ result);
	}

}
