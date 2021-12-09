package Loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();
		int count = 0;
		System.out.println(x);

		if (x == 2) {
			System.out.println("prime number");
		}
		if (x == 1) {
		    System.out.println("neiher prime nor composite");
		}
		else {
			for (int i = 2; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("prime number");
			} else {
				System.out.println("not a prime");
			}
		}

	}


	}

