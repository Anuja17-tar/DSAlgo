package Loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();

		System.out.println(x);
		int sum = 0;
		int n = x;
		int a = 0;
		while (n % 10 > 0) {
			a = n % 10;

			sum = sum + a;
			n = n / 10;

		}
		System.out.println(sum);

	}

}
