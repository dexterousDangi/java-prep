package Interview.question;

public class MissingAndDuplicateNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 3, 5 };
		int missing = 0, duplicate = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i]) - 1] < 0) {
				duplicate = Math.abs(arr[i]);
			} else {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				missing = i + 1;
				break;
			}
		}

		System.out.println("duplicate no. in the array is: " + duplicate);
		System.out.println("missing no. in  the array is: " + missing);
	}

}
