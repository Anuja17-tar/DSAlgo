package Anuja;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (count = 1; count <= 10; count += 2) {
			System.out.println(count);
		}
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		int tableOf = 6;
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result = tableOf * i;
			System.out.println(result);
		}
		int factorialOf = 7;
		int fact = 1;
		for (int i = 1; i <= factorialOf; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
