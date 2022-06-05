package Recursive;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {

		// Asking the user to enter a number
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a number :");
		int n = scanner.nextInt();

		// Calling the function
		System.out.println(fact(n));

	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

}
