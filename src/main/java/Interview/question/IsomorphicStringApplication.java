package Interview.question;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStringApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String A=scan.next();
		String B=scan.next();
		System.out.println("Are given strings are isomorphic strings: "+isIsomorphic(A,B));
		scan.close();
	}

	private static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())
			return false;
		
		HashMap<Character,Character> map1=new HashMap<>();
		HashMap<Character,Boolean> map2=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			char ch2=t.charAt(i);
			
			if(map1.containsKey(ch1)==true) {  // will check if ch1 is mapped with some character or not if yes then proceed
				if(map1.get(ch1) !=ch2) {  // will if ch1 is mapped with ch2 or not if not then return false
					return false;
				}
				
			}else {  // if the ch1 is not mapped, then we can map the ch1 but for that ch2 must not be mapped 
				
				if(map2.containsKey(ch2)==true) {  // checking if ch2 is already mapped or not, if ch2 is already mapped then return false
					return false;
				}else {                 // if ch2 is not already mapped then we map it with the ch1, and update the map2 saying ch2 is in use now
					map1.put(ch1, ch2);
					map2.put(ch2, true);
				}
				
			}
		}
		
		return true;  // and there comes no conflict then return true always
	}

}
