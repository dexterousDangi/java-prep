package com.trisect.homework;

public class Trisect_lect_2 {

	public static void main(String[] args) {
		int n=5, m=1;
		for(int i=1; i<=n;i++) {
			System.out.println(m);
			m=m+1;
		}
		m=m-2;
		for(int i=1; i<=n; i++) {
			System.out.println(m);
			m=m-1;
		}
		int y=5;
		int x=y;
		String str="";
		for(int i=x; i>=1; i--) {
			str= str+x+"#";
			x=x-1;
		}			
		x=x+2;
		y=y-1;
		for(int i=y; i>=1; i--) {
			str = str + x +"#";
			x++;
		}System.out.println(str);
		
		int nn=50;
		int mm=5;
		String stri = "";
		for(int i=0; i<=mm;i++ ) {
			stri = stri + nn +"$";
			nn=nn+1;
		}
		nn=nn-2;
	
		for(int i=1; i<=mm;i++) {
			stri = stri + nn + "$";
			nn=nn-1;
		}System.out.println(stri);
		
		
	}

}
