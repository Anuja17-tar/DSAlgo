package DSAArrays;
//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

/*Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
*/

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class KadaneAlgo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			// size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// adding elements
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Solution7 obj = new Solution7();

			// calling maxSubarraySum() function
			System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

//} Driver Code Ends

class Solution7 {

	// arr: input array
	// n: size of array
	// Function to find the sum of contiguous subarray with maximum sum.
	long maxSubarraySum(int arr[], int n) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			currSum = currSum + arr[i];
			if (maxSum < currSum) {
				maxSum = currSum;

			}
			if (currSum < 0) {
				currSum = 0;
			}
		}

		return Long.valueOf(maxSum);

	}

}

