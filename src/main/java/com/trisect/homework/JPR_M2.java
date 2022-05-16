package com.trisect.homework;

public class JPR_M2 {

	public static void main(String[] args) {

		// task 1
		String str1 = "#@$%^&:[]=@hbQ";
		int count1 = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch >= 65 && ch <= 90)
				;
			else if (ch >= 97 && ch <= 122)
				;
			else if (ch >= '0' && ch <= '9')
				;
			else
				count1 = count1 + 1;
		}
		System.out.println(str1 + " string have " + count1 + " special character.");
		System.out.println();

		// task 2
		String str2 = "123";
		String res2 = "";
		String temp2 = "";
		String real2 = "";
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			temp2 = temp2 + ch;
			res2 = "";
			for (int j = 0; j <= i; j++) {
				res2 = res2 + "#";
			}
			real2 = real2 + temp2 + res2;
		}
		System.out.println(real2);
		System.out.println();

		// task 3
		String str3 = "12049brt";
		String real3 = "";
		for (int i = 0; i < str3.length(); i++) {
			char ch = str3.charAt(i);
			if (ch == '1')
				real3 = real3 + "A";
			else if (ch == '2')
				real3 = real3 + "b";
			else if (ch == '3')
				real3 = real3 + "c";
			else if (ch >= '4' && ch <= '9')
				real3 = real3 + "x";
			else
				real3 = real3 + ch;
		}
		System.out.println(str3 + " after operation : " + real3);
		System.out.println();

		// task4
		String str4 = "I GOT A BIRTHDAY CARD";
		String real4 = "";
		for (int i = 0; i < str4.length(); i++) {
			char ch = str4.charAt(i);
			if (ch == 'A')
				real4 = real4 + "B";
			else if (ch == 'B')
				real4 = real4 + "A";
			else if (ch != 'C' && ch != 'D')
				real4 = real4 + ch;
		}
		System.out.println(str4 + " <> string after operation: " + real4);
		System.out.println();

		// task5
		String str5 = "TRIsECT";
		String before ="" ;
		String after = "";
		if(str5.length()%2==0) {
			before=str5.substring(0,str5.length()/2);
			after=str5.substring(str5.length()/2);
			System.out.println(after+before);
		}else {
			 char middle=str5.charAt(str5.length()/2);
			before=str5.substring(0,str5.length()/2);
			after=str5.substring((str5.length()/2)+1);
			System.out.println(after+middle+before);
		}
		System.out.println();

		// task7
		String str7 = "123123";
		String strA = "";
		System.out.println(str7.equals(strA + strA));
		for (int i = 0; i < (str7.length() / 2); i++) {
			char ch = str7.charAt(i);
			strA = strA + ch;
		}
		System.out.println(str7.equals(strA + strA));
		System.out.println();

		// task 8

		String str8 = "job Ready Java";
		System.out.println(str8);
		String real8[] = str8.split(" ");
		for (String s : real8)
			System.out.println(s);

		System.out.println();

		// task 9
		String str9 = "my Name Is";
		String out9 = str9.toUpperCase();
		System.out.println(out9);
		String real9 = "";
		for (int i = 0; i < str9.length(); i++) {
			char ch = str9.charAt(i);
			if(ch>='A'&&ch<='Z') {
			ch = (char) (ch + 'a'-'A'); // OR CAN SAY CH= (CHAR)CH+32;
			real9 = real9 + ch;
			}
			else
				real9=real9+ch;
				
			}
		System.out.println(real9);
		System.out.println();
		
		// task10
		String str10="Hello";
		String out10="";
		for(int i=0; i<str10.length();i++) {
			char ch=str10.charAt(i);
			if(ch>='a'&& ch<='z') {
				ch=(char) (ch-32);
				out10=out10+ch;
		}else
				out10=out10+ch;
		}System.out.println(out10);
		System.out.println();
	}

}
