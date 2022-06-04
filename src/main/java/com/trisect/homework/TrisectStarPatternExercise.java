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
	}

}
