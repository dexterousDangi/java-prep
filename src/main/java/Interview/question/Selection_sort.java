package Interview.question;

import java.util.Arrays;

// selection_sort: time complexity of this algo is O(n^2);
// 

public class Selection_sort {
	
	public static void main(String[] args) {
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		int temp = 0;
		for (int i = 0; i < b.length; i++) {
			int min = i;
			for (int j = i + 1; j < b.length; j++) {

				if (b[j]<b[min]) {  
					min = j;
				}
			}
			temp = b[i];
			b[i] = b[min];
			b[min] = temp;

		}
		System.out.println(Arrays.toString(b));
	}

}
