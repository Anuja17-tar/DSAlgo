package DSAArrays;

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxProduct {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while (tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String[] inputLine = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			System.out.println(new Solution18().maxProduct(arr, n));
		}
	}
}
//} Driver Code Ends

class Solution18 {
	long maxProduct(int[] nums, int n) {
		long product = 1;
		long maxProduct = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			product *= nums[i];
			maxProduct = Math.max(maxProduct, product);
			if (product == 0) {
				product = 1;
			}
		}
		product = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			product *= nums[i];
			maxProduct = Math.max(maxProduct, product);
			if (product == 0) {
				product = 1;
			}
		}
		return maxProduct;
	}
}