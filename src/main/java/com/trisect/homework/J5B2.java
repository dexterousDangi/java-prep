package com.trisect.homework;

import java.util.Arrays;

public class J5B2 {
	
	public int getTotalA(String str) {
		int count=0;
		char ch;
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='a')
				count =count+1;
		}
		return count;		
	}
	
	public void printTotalA(String []str) {
		int count=0;
		String st=null;
		
		for(int i=0; i<str.length; i++ ) {
			st=str[i];
			for(int j=0; j<st.length();j++) {
				char ch=st.charAt(j);
				if(ch=='a')
					count=count+1;
			}
		}
		System.out.println(Arrays.toString(str)+ " contains total : "+count+" a's");
	}
	
	public void largestA(String [] str) {
		int max=0;
		int min=0;
		int count=0;
		String larg=null;
		String st=null;
		for(int i=0; i<str.length;i++) {
			st=str[i];
			count=0;
			for(int j=0;j<st.length();j++) {
				char ch=st.charAt(j);
				if(ch=='a') {
					count =count+1;
			}
		}
			max=count;
			if(max>min) {
				min=max;
				larg=st;
		}
	}
	System.out.println(Arrays.toString(str)+" string with most a's :"+larg);
	}
	
	public void countChar(String str, char ch) {
		int len=str.length();
		int count=0;
		for(int i=0; i<len;i++) {
			char c=str.charAt(i);
			if(c==ch) {
				count=count+1;
			}
		}
		System.out.println("no. of "+ ch+" in the string :"+str+ " is "+count);
	}
	
	
	public void equalAandB(String []str) {
		
		String st=null;
		for(int i=0; i<str.length; i++ ) {
			st=str[i];
			int countA=0;
			int countB=0;
			for(int j=0; j<st.length();j++) {
				char ch=st.charAt(j);
				if(ch=='a')
					countA=countA+1;
				if(ch=='b')
					countB=countB+1;
			}
			if(countA==countB)
				System.out.println("contains equal no of 'a' and 'b' in the string :"+st);
		}
		
	}
	
	public static void main(String[] args) {
		J5B2 checkA = new J5B2();
		System.out.println("total no of A in string :" +checkA.getTotalA("banana"));
		String [] total = {"a","abef","abaca","bcd"};
		checkA.printTotalA(total);
		String [] largeA= {"aba","abaa","aab"};
		checkA.largestA(largeA);
		checkA.countChar("good", 'g');
		checkA.countChar("banana", 'n');
		String [] equalAB= {"aab","aabb","bad"};
		checkA.equalAandB(equalAB);
		
		
	}

}
