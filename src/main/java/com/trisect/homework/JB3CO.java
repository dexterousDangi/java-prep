package com.trisect.homework;

public class JB3CO {

	private static final String ch3 = null;

	public static void main(String[] args) {
		//problem 1
		String str1="global";
		System.out.println("string given :"+str1);
		char ch1;
		String out1="";
		for(int i=0; i<str1.length(); i++) {
			ch1= str1.charAt(i);
			if(ch1!='a')
				out1=out1+ch1;
		}System.out.println("desired output :"+out1);
		System.out.println();
		// problem 2
		String str2="abracadabra";
		System.out.println("string given :"+str2);
		char ch2;
		String out2 = "";
		for(int i=0; i<str2.length();i++) {
			ch2=str2.charAt(i);
			if(ch2 !='a' && ch2 !='b') {   //*
				out2=out2+ch2;
			}
		}System.out.println("desired output :" +out2);
		System.out.println();
	
		//problem3
		String str3 = "tRiSeCt";
		System.out.println("string given :"+str3);
		int count1=0;
		char ch3;
		for(int i=0; i<str3.length();i++) {
			ch3=str3.charAt(i);
			if(ch3 >='A' && ch3<='Z')
				count1 =count1 +1;
			}System.out.println("no of upper case latters in the string :"+count1);
			System.out.println();
			
		// problem 4
			String str4 = "LoWeR";
			System.out.println("string given :"+ str4 );
			char ch4;
			String out4="";
			for(int i=0; i<str4.length(); i++) {
				ch4=str4.charAt(i);
				if(ch4 >='a' && ch4<='z') {
					out4=out4+ch4;
				}
				}System.out.println("now string only contains lower case latters :" +out4);
				System.out.println();

		// problem 5
				String str5="012345";
				System.out.println("String given :"+str5);
				char ch5;
				String out5="";
				for(int i=0; i<str5.length();i++) {
					ch5=str5.charAt(i);
					if(ch5=='0' || ch5=='5') {
						out5 =out5+"#";
					}else
						out5=out5+ch5;
				}System.out.println("String without 0 or 5 :"+out5);
				System.out.println();
				
				// problem 6
				String str6 ="#99Apple";
				System.out.println("string given :"+str6);
				char ch6;
				String out6="";
				for(int i=0; i< str6.length(); i++) {
					ch6 = str6.charAt(i);
					if(ch6 >='0' && ch6<='9') {
					}else
					{
						out6=out6+ch6;
					}
				}System.out.println("string having only alphabats not any number  :"+out6);
	          }

}
