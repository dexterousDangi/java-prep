package Interview.question;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void mergeSort(int[] inputArray) {

		int inLen = inputArray.length;

		if (inLen < 2) { // base condition if array contains only one element then, returns
			return;
		}
		int midpoint = inLen / 2;
		int[] leftHalf = new int[midpoint]; // divide the input array into two halfs left and right
		int[] rightHalf = new int[inLen - midpoint];
		for (int i = 0; i < midpoint; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int i = midpoint; i < inLen; i++) {
			rightHalf[i - midpoint] = inputArray[i];
		}

		// now we get the divided array just divide them until there is only element in
		// each leftHalf, and rightHalf.
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		// now the arrays are present in sorting order now call the merge method
		merge(inputArray, leftHalf, rightHalf);
	}

	public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

		int leftsize = leftHalf.length;
		int rightsize = rightHalf.length;

		// now we need three variables to iterate over the given arrays
		int i = 0, j = 0, k = 0;

		while (i < leftsize && j < rightsize) { // iterate until both arrays contains some elements

			if (leftHalf[i] <= rightHalf[j]) { // means second is largest or they can be equal , then add leftHalf to
												// the inputArray
				inputArray[k] = leftHalf[i];
				k++;
				i++;

			} else { // rightHalf is smaller then just add it to the inputArray
				inputArray[k] = rightHalf[j];
				k++;
				j++;
			}
		}
		// now if some elements left in one of the arrays , so for them write another
		// while block for both
		// leftHalf and rightHalf. because after above code only one arrays could have
		// elements not both.
		while (i < leftsize) {
			inputArray[k] = leftHalf[i];
			k++;
			i++;
		}
		while (j < rightsize) {
			inputArray[k] = rightHalf[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		Random rdm = new Random();
		int[] number = new int[13];
		for (int i = 0; i < number.length; i++) {
			number[i] = rdm.nextInt(1000);
		}
		System.out.println("before : " + Arrays.toString(number));
		mergeSort(number);
		System.out.println("after : " + Arrays.toString(number));
	}

}
