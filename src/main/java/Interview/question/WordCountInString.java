package Interview.question;

import java.util.HashSet;

public class WordCountInString {

	public static void main(String[] args) {
		String demo=" Pardeep Dangi";
		String demo1=demo.trim().toLowerCase();
		System.out.println(demo1);
		String [] words=demo1.split(" ");
		HashSet<Character> set= new HashSet<>();
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			char ch;
			for(int j=0;j<str.length();j++) {
				ch=str.charAt(j);
				set.add(ch);
			}
		}
		System.out.println(set);
		System.out.println("words in the string:"+set.size());
	}

}
