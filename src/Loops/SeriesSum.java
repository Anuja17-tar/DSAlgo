package Loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();

		System.out.println(x);
		float result = 0f;
		for (float i = 1f; i <= x; i++) {
			if (i % 2 == 0) {
				result = result - (1 / i);
			} else {
				result = result + (1 / i);
			}

		}
		System.out.println(result);

	}

}
