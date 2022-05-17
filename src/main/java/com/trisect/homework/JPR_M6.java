package com.trisect.homework;

public class JPR_M6 {

	public static void main(String[] args) {
		// task 1
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task 2
		int n2 = 5;
		for (int i = 1; i <= n2; i++) {
			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print("1");
					j++;
				}
				if (j <= i) {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		System.out.println();

		// task3
		int n3 = 5;
		for (int i = 1; i <= n3; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();

		// task4
		int n4 = 8;
		for (int i = 1; i <= n4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n4 - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task 5

		int n5 = 5;
		for (int i = n5; i >= 1; i--) {
			for (int j = n5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		// task6

		int n6 = 5;
		for (int i = 1; i <= n6; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task7

		int n7 = 5;
		for (int i = 1; i <= n7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();

		// task9

		int n9 = 5;
		for (int i = n9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task10
		int n10 = 5;
		for (int i = 1; i <= n10; i++) {
			for (int j = n10; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task11
		int n11 = 5;
		for (int i = n11; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// task 12
		int n12 = 5;
		for (int i = 1; i <= n12; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < n12;) {
					if (j % 2 == 0) {
						System.out.print("1");
						j++;
					} else {
						System.out.print("0");
						j++;
					}
				}
			} else {
				for (int k = 1; k <= n12;) {
					if (k % 2 == 0) {
						System.out.print("0");
						k++;
					} else {
						System.out.print("1");
						k++;
					}
				}
			}
			System.out.println();
		}
		System.out.println();

		// task13

		int n13 = 5;
		for (int i = 1; i <= n13; i++) {
			for (int j = i; j <= n13; j++) {
				System.out.print(j);
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}System.out.println();

		//task14
		int n14=5;
		for(int i=1;i<=n14;i++) {
			for(int j=n14;j>i;j--) {
				System.out.print("1");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		//task15
		int n15=5;
		for(int i=1;i<=n15;i++) {
			for(int j=1;j<=i;j++) {
				if(j==i) {
					System.out.print(j);
				}else {
					System.out.print("0");
				}
			}for(int k=n15;k>i;k--) {
				System.out.print("0");
			}System.out.println();
		}System.out.println();
	
		// task16 ?
		int n16=4;
		for(int i=n16;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
			for(int i=2;i<n14;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(j+1);
				}System.out.println();
			}
			
			System.out.println();
		
			//task17 ?

			int n17=4;		
			for(int i=n17;i>=1;i--) {
				
				for(int j=1;j<=i;j++) {
					System.out.print(j);				
				}
				System.out.println();
			}   System.out.println();
			
			//task 18
			int n18=5;
			for(int i=1;i<=n18;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				for(int k=i;k>1;k--) {
					System.out.print(k-1);
				}System.out.println();
			}
	
	
	}

}





















