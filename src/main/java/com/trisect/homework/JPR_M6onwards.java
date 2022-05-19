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

			for (int j = i; j <= n21; j++) {
				System.out.print(j);
			}
			for (int k = n21; k > i; k--) {
				System.out.print((k - 1));
			}
			System.out.println();
		}
		System.out.println();

		// task22
		int n22 = 8;
		for (int i = n22; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				if (j == 1) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			for (int m = 1; m < 2 * (n22 - i); m++) {
				System.out.print("*");
			}

			for (int k = i; k >= 1; k--) {
				if (k == n22) {
				} else if (k == i) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();

		// task23
		int n23 = 6;
		for (int i = 1; i <= n23; i++) {
			for (int j = n23 - i; j >= 1; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1) {
					System.out.print(k);
				} else {
					System.out.print("*" + k);
				}
			}
			for (int m = n23 - i; m >= 1; m--) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// task24
		int n24=6;
		for(int i=1;i<=n24;i++) {
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			for(int j=i;j<=n24;j++) {
				if(j==i) {
					System.out.print(j);
				}else {
					System.out.print("*"+j);
				}
			}for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// task25
		int n25=5;
		for(int i=1;i<=n25;i++) {
			for(int j=i;j<n25;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				if(k==1) {
					System.out.print(i);
				}else {
					System.out.print("*"+i);
				}
			}for(int j=i;j<n25;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}System.out.println();
		
		//task26
		int n26=5;
		for(int i=1;i<=n26;i++) {
			for(int j=i;j<n26;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l);
			}
			for(int j=i;j<n26;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		//task27
		int n27=6;
		for(int i=1;i<=n27;i++) {
			for(int k=i;k>1;k--) {
				System.out.print("*");
			}
			for(int j=i;j<=n27;j++) {
				if(j==i) {
					System.out.print(j);
				}else {
					System.out.print("*"+j);
				}
			}for(int k=i;k>1;k--) {
				System.out.print("*");
			}			
			System.out.println();
		}
		for(int i=n27-1;i>=1;i--) {
			for(int k=i;k>1;k--) {
				System.out.print("*");
			}			
			for(int j=i;j<=n27;j++) {
				if(j==i) {
					System.out.print(j);
				}else {
					System.out.print("*"+j);
				}
			}for(int k=i;k>1;k--) {
				System.out.print("*");
			}				
			System.out.println();
		}System.out.println();
		
		//task 29
		
		
	}
}













