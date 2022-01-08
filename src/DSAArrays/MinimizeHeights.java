package DSAArrays;

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimizeHeights {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine().trim());
		while (tc-- > 0) {
			String[] inputLine;
			inputLine = br.readLine().trim().split(" ");
			int k = Integer.parseInt(inputLine[0]);
			inputLine = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int[] arr = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			int ans = new Solution8().getMinDiff(arr, n, k);
			System.out.println(ans);
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution8 {
	int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		int ans = arr[n - 1] - arr[0];
		int min = arr[0] + k;
		int max = arr[n - 1] - k;
		int minTemp, maxTemp;
		for (int i = 0; i < n - 1; i++) {

			minTemp = Math.min(min, arr[i + 1] - k);
			maxTemp = Math.max(max, arr[i] + k);
			if (minTemp < 0) {
				continue;
			}
			if (maxTemp - minTemp < ans) {
				ans = maxTemp - minTemp;
			}
		}
		return ans;
	}
}

