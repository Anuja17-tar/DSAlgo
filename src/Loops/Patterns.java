package Loops;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int j = 4; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= 5; i++) {
//				System.out.print("*" + " ");
//			}
//
//			System.out.println();
//		}

	}

}
