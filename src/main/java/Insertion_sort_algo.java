import java.util.Arrays;

public class Insertion_sort_algo {

	public static void main(String[] args) {

		int temp = 0;
		int j = 0;
		int[] num = { 32, 43, 2, 5, 2, 2, 45, 3, 5, 3, 342 };
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			j = i;
			while (j > 0 && num[j - 1] > temp) {
				num[j] = num[j - 1];
				j = j - 1;
			}
			num[j] = temp;
		}
		System.out.println(Arrays.toString(num));
	}

}
