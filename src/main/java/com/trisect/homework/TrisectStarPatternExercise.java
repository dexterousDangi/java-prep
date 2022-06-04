package com.trisect.homework;

public class TrisectStarPatternExercise {

	public static void main(String[] args) {
		
		// task 1
		int n1=5;
		for(int row=1;row<=n1;row++) {
			for(int space=1;space<row;space++) {
				System.out.print(" ");
			}
			for(int star=5;star>=row;star--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=n1-1;row>=1;row--) {
			for(int space=1;space<row;space++) {
				System.out.print(" ");
			}
			for(int star=row;star<=n1;star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		// task 2
		
		int n2=5;
		for(int row=1;row<=n2;row++) {
			for(int star=1;star<=row;star++) {
				if(star==1||star==row|| row==n2) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		// task3
		
		
		int condition3=5;
		for(int i=1;i<=condition3;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}for(int star=condition3;star>=i;star--) {
				if(star==condition3||star==i||i==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		// task4
		
		int condition4=5;
		for(int row=1;row<=condition4;row++) {
			for(int space=condition4;space>row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=(2*row)-1;star++) {
			if(star==1||star==2*row-1||row==condition4) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}System.out.println();
		}
		System.out.println();
		
		//task5
		int condition5=5;
		for(int row=1;row<=condition5;row++) {
			for(int space=condition5;space>row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++) {
				if(star==1||star==2*row-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(int row=condition5-1;row>=1;row--) {
			for(int space=condition5-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++) {
				if(star==1||star==2*row-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		//task6
		int condition6=5;
		for(int row =1;row<=condition6;row++) {
			for(int space=condition6;space>row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<=condition6;star++) {
				if(star==1||star==condition6||row==1||row ==condition6) {
						System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println();
		
		// task7
		
		int condition7=7;
		for(int row=1;row<=condition7;row++) {
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			for(int space=row*2;space<=2*condition7-1;space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=row;star++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int row=1;row<=condition7-1;row++) {
			for(int star=row;star<condition7;star++) {
				System.out.print("*");
			}
			for(int space=1;space<=2*row;space++) {
				System.out.print(" ");
			}
			for(int star=row;star<condition7;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// task 8
		int condition8=5;
		for(int row=1;row<=2*condition8-1;row++) {
			for(int star=1;star<=condition8;star++) {
				if(star==row||star==condition8+1-row) {
					System.out.print("*");
				}System.out.print(" ");
			}System.out.println();
		}
		
		
		
	}

}


















