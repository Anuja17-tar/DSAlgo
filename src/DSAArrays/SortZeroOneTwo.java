package DSAArrays;


// { Driver Code Starts
//Initial template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// } Driver Code Ends
//User function template for Java

class Solution5 {
	public static void sort012(int arr[], int n) {
		int zero = 0;
		int one = 0;
		int two = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zero++;
			}
			if (arr[i] == 1) {
				one++;
			}
			if (arr[i] == 2) {
				two++;
			}

		}
		for (int i = 0; i < zero; i++) {
			arr[i] = 0;

		}
		for (int i = zero; i < zero + one; i++) {
			arr[i] = 1;

		}
		for (int i = zero + one; i < n; i++) {
			arr[i] = 2;

		}

		// code here
	}
}

// { Driver Code Starts.

class SortZeroOneTwo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution5 ob = new Solution5();
			ob.sort012(arr, n);
			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr[i] + " ");
			}
			System.out.println(str);
		}
	}
}

// } Driver Code Ends
