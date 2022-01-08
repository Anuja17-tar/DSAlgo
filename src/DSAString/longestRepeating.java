package DSAString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class longestRepeating {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		while (T-- > 0) {
			String str = br.readLine().trim();
			Solution6s ob = new Solution6s();
			int ans = ob.LongestRepeatingSubsequence(str);
			System.out.println(ans);
		}
	}
}
//} Driver Code Ends

//User function Template for Java

class Solution6s {
	public int LongestRepeatingSubsequence(String str) {
		int n = str.length();
		int[][] ans = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					ans[i][j] = 0;
				else if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
					ans[i][j] = ans[i - 1][j - 1] + 1;
				else
					ans[i][j] = Math.max(ans[i - 1][j], ans[i][j - 1]);
			}
		}
		return ans[n][n];
	}
}
