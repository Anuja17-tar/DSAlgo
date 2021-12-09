package Loops;

import java.util.Scanner;

public class PatternsAdvanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();

		System.out.println(x);

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1; i <= x + 1; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= x - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
