package DSAString;

class AllSequences {
	public static void main(String[] args) {
		String str = "abc";
		int n = str.length();
		allSubsequences(str, 0, "", n);
	}

	static void allSubsequences(String str, int i, String ans, int n) {
		if (i == n)
			System.out.println(ans);
		else {
			allSubsequences(str, i + 1, ans, n);
			ans = ans + str.charAt(i);
			allSubsequences(str, i + 1, ans, n);
		}

	}
}

