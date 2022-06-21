import java.util.Arrays;

public class Move_Negative_element_In_Front {

	public static void main(String[] args) {
		int[] arr = { 2, -9, 10, 12, 5, -2, 10, -4 };
		System.out.println(Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] < 0 && arr[right] < 0) {
				left++;
			} else if (arr[left] > 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else if (arr[left] > 0 && arr[right] > 0) {
				right--;
			} else {
				left++;
				right--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
