package Loops;

import java.util.Scanner;

public class PatternsAdvance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();

		System.out.println(x);
//		for (int i = 1; i <= x; i++) {
//			for (int k = 1; k <= x - i; k++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*  ");
//			}
//			System.out.println();
//
//		}
//		int count = 0;
//		for (int i = 1; i <= x; i++) {
//			for (int k = 1; k <= x - i; k++) {
//				System.out.print("  ");
//
//
//			}
//			for (int j = 1; j <= i; j++) {
//				count++;
//				System.out.print(count + "  ");
//			}
//			System.out.println();
//
//		}
//		for (int j = 1; j <= x; j++) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//		for (int j = x - 1; j >= 1; j--) {
//			for (int i = j; i >= 1; i--) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		System.out.println("*");
		for (int i = 2; i <= x - 1; i++) {
			System.out.print("* ");
			for (int j = 1; j <= i - 2; j++) {

				System.out.print("  ");

			}
			System.out.println("* ");

		}
		if (x > 1) {
			for (int k = 1; k <= x; k++) {
				System.out.print("* ");
			}
		}

	}


}
