package DSAString;

public class RabinCarp {
	// pattern Matching
	// Text ="GEEKSFORGEEKS"
	// Pattern="GEEK"
//	Output->Pattern is present at index 0 and 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "GEEKSFORGEEKS";
		String pattern = "GEEKS";
		patternMatch(text, pattern);



	}

	private static int patternMatch(String text, String pattern) {
		int alphabets = 26;
		int window = pattern.length();
		int patternHashCode = patternHC(pattern, alphabets);
		int index = -1;
		int substringHashCode = patternHC(text.substring(0, window), alphabets);
		if (substringHashCode == patternHashCode) {
			if (text.substring(0, window).equals(pattern))
				System.out.println("Pattern found at " + 0);
		}

		for (int i = 1; i < text.length() - window + 1; i++) {
			int prev = text.charAt(i - 1) * (int) Math.pow(alphabets, pattern.length() - 1); // G ASCII value * 26^3
			substringHashCode = (substringHashCode - prev) * alphabets + text.charAt(i + window - 1); // hashCode(GEEKS)-G's
																										// value * 16 +
																										// next addition
			if (substringHashCode == patternHashCode) {
				if (text.substring(i, i + window).equals(pattern))
					System.out.println("Pattern found at " + i);
			}
		}

		return index;

	}

	private static int patternHC(String text, int alphabets) {
		int ans = 0;
		int k = text.length() - 1;
		for (int x = 0; x < text.length(); x++) {
			ans += text.charAt(x) * (int) Math.pow(alphabets, k);
			k--;
		}

		return ans;
	}

//	private static void patternMatch(String text, String pattern) {
//		int m = pattern.length();
//		int n = text.length();
//		int ans = 0;
//		int[] index;
//		if (m <= n) {
//			for (int j = 0; j <= n - m; j++) {
//				int i;
//				for (i = 0; i < m; i++) {
//					if (text.charAt(i + j) != pattern.charAt(i)) {
//						break;
//					}
//
//				}
//				if (i == m) {
//					System.out.println(j);
//				}
//
//
//			}
//
//		}
//
//
//	}

}
