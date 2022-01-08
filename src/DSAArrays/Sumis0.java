package DSAArrays;

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sumis0 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		while (tc-- > 0) {
			String[] inputLine;
			inputLine = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int k = Integer.parseInt(inputLine[1]);
			int[] arr = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			int ans = new Solution1a().getPairsCount(arr, n, k);
			System.out.println(ans);
		}
	}
}
//} Driver Code Ends

//User function Template for Java

class Solution1a {
	int getPairsCount(int[] arr, int n, int k) {
		int count = 0;
		int l = 0;
		int r = n - 1;
		Arrays.sort(arr);
		while (l <= n - 1 && r >= 0) {
			if (arr[l] + arr[r] == k) {
				count++;
				l++;
			}
			r--;
		}
		return count;

	}

}

