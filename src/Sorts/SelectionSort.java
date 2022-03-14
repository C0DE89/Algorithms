package Sorts;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		// Declaring and initializing an unsorted array of integers.
		int[] array = { 6, 5, 3, 1, 8, 7, 2, 4 };

		// Calling the sorting function
		selectionSort(array);

		// Displaying the sorted array
		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int maxValueIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[maxValueIndex] < array[j])
					maxValueIndex = j;
			}
			if (i != maxValueIndex)
				swap(array, i, maxValueIndex);
		}
	}

	// This function swamps the values of two specified array elements.
	public static void swap(int[] array, int iPos, int jPos) {
		int temp;
		temp = array[iPos];
		array[iPos] = array[jPos];
		array[jPos] = temp;
	}
}
