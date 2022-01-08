package DSAArrays;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class KthSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		System.out.println("Enter number of test cases");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("Enter size");
			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				System.out.println("Enter Elements");
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter K element");
			int k = sc.nextInt();
			Solution ob = new Solution();
			out.println(ob.kthSmallest(arr, 0, n - 1, k));
		}
		out.flush();
	}
}
//} Driver Code Ends

//User function Template for Java

class Solution {
	public static int kthSmallest(int[] arr, int l, int r, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] < pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
}
}
