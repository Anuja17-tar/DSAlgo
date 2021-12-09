package Arrays;

import java.util.Scanner;

public class MatrixAdditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for rows:");
		int rows = sc.nextInt();
		System.out.println("Enter a value for columns:");
		int cols = sc.nextInt();
		System.out.println("Enter a value for first matrix:");
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a value for second matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}

	}

}
