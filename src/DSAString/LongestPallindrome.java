package DSAString;

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LongestPallindrome {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S = read.readLine();

			Solutions7 ob = new Solutions7();
			System.out.println(ob.longestPalin(S));
		}
	}
}
//} Driver Code Ends

//User function Template for Java

class Solutions7 {
	static String longestPalin(String S) { // aaaabbaa
		int low, high;
		int start = 0;
		int end = 1;
		for (int i = 1; i < S.length(); i++) {
			// even
			low = i - 1;// 0 1
			high = i;// 1 2
			while (low >= 0 && high < S.length() && S.charAt(low) == S.charAt(high)) {// s(0)==s(1)->true
				if (high - low + 1 > end) { // 1-0+1 2>1, end =2, start=0
					start = low;
					end = high - low + 1;
				}
				low--;// -1
				high++;// 2
			}
			// odd
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < S.length() && S.charAt(low) == S.charAt(high)) {
				if (high - low + 1 > end) {
					start = low;
					end = high - low + 1;
				}
				low--;
				high++;
			}
		}
		return S.substring(start, start + end);

	}
}