package Sorts;

import java.util.Arrays;

/**
 * Bubble sort java implementation.
 * 
 * @see here "wikipedia.org/wiki/Bubble_sort" for more details.
 * 
 * @author ESS. Amine
 */

public class BubbleSort {

	// Bubble sort function
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	// This function swamps the values of two specified array elements.
	public static void swap(int[] array, int iPos, int jPos) {
		int temp;
		temp = array[iPos];
		array[iPos] = array[jPos];
		array[jPos] = temp;
	}

	public static void main(String args[]) {
		// Declaring and initializing an unsorted array of integers.
		int array[] = { 23, 66, 17, 5, 16, 9, 33 };

		// Calling the sorting function
		bubbleSort(array);

		// Displaying the array elements
		System.out.println(Arrays.toString(array));

	}

}
