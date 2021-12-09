package Practice;
import java.util.Arrays;
import java.util.Scanner;

class Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Solution g = new Solution();
			if (g.findTriplets(a, n))
				System.out.println("1");
			else
				System.out.println("0");

		}
	}
}// } Driver Code Ends
/* Complete the function below */


class Solution {
	// arr[]: input array
	// n: size of the array
	// Function to find triplets with zero sum.
	public boolean findTriplets(int arr[], int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n - 2; i++) {
			if (twoSum(arr, -arr[i], i + 1)) {
				return true;
			}

		}
		return false;
	}

	public boolean twoSum(int a[], int x, int i) {
		// two Pointers algorithm
		int j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] < x) {
				i++;
			} else if (a[i] + a[j] > x) {
				j--;
			} else {
				return true;
			}

		}
		return false;
	}
}