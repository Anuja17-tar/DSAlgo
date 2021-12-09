package Practice;

// { Driver Code Starts
//Initial Template for Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; ++i)
				arr[i] = sc.nextInt();
			Solution3 ob = new Solution3();
			ArrayList<Integer> list = ob.kLargest(arr, n, k);
			for (int i = 0; i < list.size(); i++)
				System.out.print(list.get(i) + " ");
			System.out.println();
			t--;
		}
	}
}

// } Driver Code Ends

//User function Template for Java

class Solution3 {
	// Function to return k largest elements from an array.
	public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
		PriorityQueue<Integer> largest = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			if (i < k) {
				largest.add(arr[i]);
			} else {
				if (largest.peek() < arr[i]) {
					largest.poll();
					largest.add(arr[i]);
				}
			}
		}
		ArrayList<Integer> al = new ArrayList<>(largest);
		Collections.sort(al, Collections.reverseOrder());
		return al;

	}
}
