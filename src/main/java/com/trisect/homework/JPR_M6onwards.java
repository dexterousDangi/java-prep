package com.trisect.homework;

public class JPR_M6onwards {

	public static void main(String[] args) {

		// task 19
		int n19 = 5;
		for (int i = 1; i <= n19; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + 1);
			}
			System.out.println();
		}
		System.out.println();

		// task 20 *

		int n20 = 3;
		for (int i = 1; i <= n20; i++) {
			for (int j = i; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			for (int k = 2 * i - 1; k > i; k--) {
				System.out.print(k - 1);
			}
			System.out.println();
		}
		System.out.println();

		// task21
		int n21 = 5;
		for (int i = n21; i >= 1; i--) {
			for(int l=i;l>1;l--) {
				System.out.print("*");
			}
			for (int j = i; j <= n21; j++) {
				System.out.print(j);
			}
			for (int k = n21; k > i; k--) {
				System.out.print((k -1));
			}
			for(int m=i;m>1;m--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
