package DSAMatrix;


//{ Driver Code Starts
//Initial Template for Java
import java.util.Scanner;

class KthSmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while (t > 0) {
			int n = Integer.parseInt(sc.next());
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = Integer.parseInt(sc.next());

			int k = Integer.parseInt(sc.next());
			Solution4m ob = new Solution4m();
			System.out.println(ob.kthSmallest(a, n, k));

			t--;
		}
	}
}
//} Driver Code Ends

//User function Template for Java

class Solution4m {
	public static int kthSmallest(int[][] mat, int n, int k) {

		int l = mat[0][0], r = mat[n - 1][n - 1];
		while (l <= r) {
			int mid1 = l + (r - l) / 2;
			int count = 0;
			for (int i = 0; i < n; i++) {
				int left = 0, right = n - 1;
				while (left <= right) {
					int mid = left + (right - left) / 2;
					if (mat[i][mid] <= mid1) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				count += left;
			}
			if (count < k)
				l = mid1 + 1;
			else
				r = mid1 - 1;
		}
		return l;
	}
	// using priorityQueue
	/*
	 * PriorityQueue<Integer>pq=new PriorityQueue<>(); for(int i=0;i<n;i++) {
	 * for(int j=0;j<n;j++) { pq.add(mat[i][j]); } } while(k>1) { pq.remove(); k--;
	 * } return pq.peek();
	 */
}
