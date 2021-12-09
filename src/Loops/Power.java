package Loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for x and y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x + " " + y);
		int result = 1;

		for (int i = 1; i <= y; i++) {
			result = x * result;

		}
		System.out.println(result);
	}

}
