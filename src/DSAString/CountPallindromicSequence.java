package DSAString;

public class CountPallindromicSequence {

	public static void main(String[] args) {
		String s = "abcd";
		long ans = countPS(s);
		System.out.println(ans);
	}

	static long[][] dp = new long[1001][1001];
	static int mod = 1000000007;
	private static long countPS(String s) {
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				dp[i][j] = -1;
			}
		}

		int i = 0;
		int j = s.length() - 1;
		return count(s, i, j);
	}

	private static long count(String s, int i, int j) {
		if (i > j)
			return 0;
		if (i == j)
			return 1;
		if (s.charAt(i) == s.charAt(j))
			return dp[i][j] = (count(s, i + 1, j) % mod + count(s, i, j - 1) % mod + 1) % mod;
		else
			return dp[i][j] = (count(s, i + 1, j) % mod + count(s, i, j - 1) % mod - count(s, i + 1, j - 1) % mod)
					% mod;

	}

}
