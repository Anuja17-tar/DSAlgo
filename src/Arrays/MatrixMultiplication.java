package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Matrix Dimensions");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];

		System.out.println("Enter Matrix 'a'");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Matrix 'b'");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("Result Matrix 'c' is");
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				for (int k = 0; k < rows; k++) {

					c[i][j] += a[i][k] * b[k][j];
				}

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}


}
