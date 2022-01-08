package DSAString;


//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class countAndSay {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());

			Solution4s ob = new Solution4s();

			System.out.println(ob.lookandsay(n));
		}
	}
} // } Driver Code Ends

//User function Template for Java

class Solution4s {
	static String lookandsay(int n) { // n=4->"1211" n=3-> "21" n=2-> "11" n=1
		if (n == 1)
			return "1";// base case
		String s = lookandsay(n - 1); // recurrsion n=3 n=2 n=1
		StringBuilder res = new StringBuilder(); // to decrease time reqd can also use normal string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) { // check for end cases until then increase
																			// count
				res.append(count).append(s.charAt(i));
				count = 0;// to start from 0 for next set of numbers
			}
		}
		return res.toString();
	}
}
