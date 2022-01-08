package DSAMatrix;

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MedianInSortedMatrix {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S[] = read.readLine().split(" ");
			int R = Integer.parseInt(S[0]);
			int C = Integer.parseInt(S[1]);
			String line[] = read.readLine().trim().split("\\s+");
			int matrix[][] = new int[R][C];
			int c = 0;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					matrix[i][j] = Integer.parseInt(line[c++]);
				}
			}
			Solution2m ob = new Solution2m();
			int ans = ob.median(matrix, R, C);
			System.out.println(ans);
		}
	}
}
//} Driver Code Ends
/*
 * R = 3, C = 3 M = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
 */
class Solution2m {

	public int median(int[][] matrix, int r, int c) {
		int start = Integer.MAX_VALUE;
		int end = Integer.MIN_VALUE;
		// to find smallest element in first and last columns
		for (int i = 0; i < r; i++) {
			start = Math.min(start, matrix[i][0]); // start = 1
			end = Math.max(start, matrix[i][c - 1]); // end = 9

		}
		while (start <= end) {
			int m = start + (end - start) / 2;
			int count = 0;
			for (int row[] : matrix) {
				count += upperBound(row, m);
			}
			if (count <= r * c / 2) {
				start = m + 1;
			} else
				end = m - 1;
		}

		return start;
	}

	private int upperBound(int[] row, int m) {
		int low = 0;
		int high = row.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (row[mid] <= m)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low;
	}

}
