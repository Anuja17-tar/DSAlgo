package DSAArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//{ Driver Code Starts
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervals {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] s = br.readLine().trim().split(" ");
			int[][] Intervals = new int[n][2];
			int j = 0;
			for (int i = 0; i < n; i++) {
				Intervals[i][0] = Integer.parseInt(s[j]);
				j++;
				Intervals[i][1] = Integer.parseInt(s[j]);
				j++;
			}
			Solution11 obj = new Solution11();
			int[][] ans = obj.overlappedInterval(Intervals);
			for (int i = 0; i < ans.length; i++) {
				for (j = 0; j < ans[i].length; j++) {
					System.out.print(ans[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
//} Driver Code Ends

class Solution11 {
	public int[][] overlappedInterval(int[][] arr) {
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);

		List<int[]> ans = new ArrayList<>();

		int start = arr[0][0];
		int end = arr[0][1];

		for (int[] e : arr) {
			if (e[0] <= end) {
				end = Math.max(end, e[1]);
			} else {
				ans.add(new int[] { start, end });
				start = e[0];
				end = e[1];
			}
		}
		ans.add(new int[] { start, end });
		return ans.toArray(new int[0][]);

	}
}

