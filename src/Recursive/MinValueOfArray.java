package Recursive;

public class MinValueOfArray {

	public static void main(String args[]) {

		int[] array = { 12, 6, 99, 9, 3, 45, 101 };

		int n = array.length;
		System.out.println(minValueInArray(array, n));

	}

	public static int minValueInArray(int[] array, int n) {
		
		if (n == 1)
			return array[0];
		else
			return Math.min(array[n - 1], minValueInArray(array, n - 1));
	}

}
