package DSAArrays;

public class RearrangePosNeg {
	public static void main(String[] args) {
		int arr[] = { 2, 3, -4, -1, 6, -9 };

		int n = arr.length;

		System.out.println("Given array is ");
		printArray(arr, n);

		rearrange(arr, n);

		System.out.println("Rearranged array is ");
		printArray(arr, n);
	}

	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	static void swap(int arr[], int index1, int index2) {
		int c = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = c;
	}

	static int[] rearrange(int[] a, int n) {
		n = a.length;
		int pivot = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				pivot++;
				swap(a, pivot, i);

			}
		}
		int j = pivot + 1;
		int i = 0;
		while (i < j && j < n && a[i] < 0) {
			System.out.println("hi");
			swap(a, j, i);
			i = i + 2;
			j++;
		}
		return a;

	}
}

