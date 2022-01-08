package Recurssion;

public class GameTheory {

	public static void main(String[] args) {
		int a[] = { 1, 5, 700, 2 };
		System.out.println(coinMax(a, 0, a.length - 1));

	}

	static int coinMax(int a[], int l, int r) {
		if (l + 1 == r) {
			return Math.max(a[l], a[r]);
		}
		int case1 = a[l] + Math.min(coinMax(a, l + 2, r), coinMax(a, l + 1, r - 1));
		int case2 = a[r] + Math.min(coinMax(a, l, r - 2), coinMax(a, l + 1, r - 1));

		return Math.max(case1, case2);
	}

}
