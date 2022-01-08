package DSAArrays;

public class MedianEqualArrays {
	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 12, 15, 26, 38 };
		int arr2[] = new int[] { 2, 13, 17, 30, 45 };
		System.out.println("Count of minimum operations is " + median(arr1, arr2));

	}

	private static int median(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int arr3[] = new int[2 * n];
		int j = 0;
		int k = 0;
		for (int i = 0; i < n;) {
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}

		return (arr3[n] + arr3[n - 1]) / 2;

	}
}
