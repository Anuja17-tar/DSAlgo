package DSAString;

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pallindrome {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S = read.readLine();

			Solution ob = new Solution();
			System.out.println(ob.isPalindrome(S));
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution {
	int isPalindrome(String S) {
		int ans = 1;
		int i = 0;
		int j = S.length() - 1;
		while (i < j) {
			char ch1 = S.charAt(i);
			char ch2 = S.charAt(j);
			if (ch1 != ch2) {
				ans = 0;
			}
			i++;
			j--;
		}
		return ans;
	}
	/*
	 * using recurrsion boolean isPalindrome(String S,l,r) { if(l<=r) return true;
	 * if(S.charAt(l)!=S.charAt(r)) return false; return isPalindrome(String
	 * S,l+1,r-1); * }
	 */

};

