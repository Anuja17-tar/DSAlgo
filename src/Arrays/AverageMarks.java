package Arrays;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Of Students:");
		int x = sc.nextInt();
		int marks[] = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.println("Enter MArks of STudents:");
			marks[i] = sc.nextInt();

		}

		int avgMarks = 0;
		for (int i = 0; i < x; i++) {
			avgMarks += marks[i];

		}
		avgMarks = avgMarks / x;
		System.out.println(avgMarks);

	}

}
