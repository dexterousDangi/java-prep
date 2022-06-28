import java.util.Arrays;
import java.util.Random;

public class MergeSortAgain {

	public static void mergeSort(int[] inputArray) {
		int inLen = inputArray.length;
		if (inLen < 2)
			return;

		int midpoint = inLen / 2;
		int[] leftHalf = new int[midpoint];
		int[] rightHalf = new int[inLen - midpoint];

		for (int i = 0; i < midpoint; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int j = midpoint; j < inLen; j++) {
			rightHalf[j - midpoint] = inputArray[j];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);

		merge(inputArray, leftHalf, rightHalf);
	}

	public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftsize = leftHalf.length;
		int rightsize = rightHalf.length;

		int i = 0, j = 0, k = 0;
		while(i<leftsize && j<rightsize) {
			if(leftHalf[i]<= rightHalf[j]) {
				inputArray[k]=leftHalf[i];
				k++;
				i++;
			}else //(leftHalf[i]> rightHalf[j]
			{
				inputArray[k]=rightHalf[j];
				k++;
				j++;
			}
		}
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
