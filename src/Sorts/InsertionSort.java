package Sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		// Declaring and initializing an unsorted array of integers.
		int[] array = { 6, 5, 3, 1, 8, 7, 2, 4 };

		// Calling the sorting function
		insertionSortB(array);

		// Displaying the sorted array
		System.out.println(Arrays.toString(array));
	}

	// insertion sort algorithm with using a  for loop inside a another for loop.
	public static void insertionSortA(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					swap(array, i, j);
				}
			}
		}
	}

	// insertion sort algorithm with using a while loop inside a for loop.
	public static void insertionSortB(int[] array) {
		int temp, j;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
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
