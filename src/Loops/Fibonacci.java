package Loops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for x:");
		int x = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i < x - 2; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}

}
