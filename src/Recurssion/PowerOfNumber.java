package Recurssion;

public class PowerOfNumber {
	public static void main(String[] args) {
		System.out.println(power(2, 4));
		System.out.println(fastPow(2, 5));
	}

	static int power(int n, int m) {
		if (m == 0) {
			return 1;
		}
			return power(n, (m - 1)) * n;

	}

	static int fastPow(int n, int m) {
		if (m == 0) {
			return 1;
		} else if (m % 2 == 0) {
			return fastPow(n * n, m / 2);
		} else {
			return fastPow(n, m - 1) * n;
		}
	}

}
