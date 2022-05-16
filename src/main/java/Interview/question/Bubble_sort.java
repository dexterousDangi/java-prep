package Interview.question;

import java.util.Arrays;

// Bubble sort : time complexity in worst case is O(n^2);

public class Bubble_sort {

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 3, 2, 1, 4, 3 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			
			}
		}System.out.println(Arrays.toString(a));

	}

}

