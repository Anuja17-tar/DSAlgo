package DSAArrays;

class MoveNeg {
	public static void main(String[] args) {
		int arr[] = { -4, 8, 0, 1, 2, 3, -9, -7 };
		negArray(arr, arr.length);
	}

	static void negArray(int a[], int n) {
		int count = 0;
		int ans[] = new int[n];
		for (int x = 0; x < a.length; x++) {
			if (a[x] < 0) {
				count++;
			}

		}

		int i = 0;
		int j = 0;

		while (i < n) {
			if (a[i] < 0) {
				ans[j] = a[i];
				i++;
				j++;

			} else if (a[i] >= 0) {
				ans[count] = a[i];
				i++;
				count++;
			}
		}

		for (int m = 0; m < n; m++) {
			System.out.println(ans[m]);
		}
	}
}

