package DSAArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class TripletsWithGivenSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int X = Integer.parseInt(inputLine[1]);
			int A[] = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(inputLine[i]);
			}
			Solution22 ob = new Solution22();
			boolean ans = ob.find3Numbers(A, n, X);
			System.out.println(ans ? 1 : 0);
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution22 {
	// Function to find if there exists a triplet in the
	// array A[] which sums up to X.
	public static boolean find3Numbers(int A[], int n, int X) {

		// Brute-Force
//		boolean isTrue = false;
//		int sum = 0;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				for (int k = j + 1; k < n; k++) {
//					sum = A[k] + A[j] + A[i];
//					if (sum == X) {
//						isTrue = true;
//					}
//				}
//
//			}
//
//		}
//		return isTrue;
		// O(n2) time and O(N) space
//		 boolean isTrue = false;
//	        for(int i =0;i<n;i++){
//	            Set<Integer> s = new HashSet<>();
//	            int curr = X- A[i];
//	             for(int j =i+1;j<n;j++){
//	            if(s.contains(curr-A[j])){
//	                isTrue=true;
//	            }
//	            else{
//	                s.add(A[j]);
//	            }
//	        }
//
//	    }
//	     return isTrue;
		// O(n2) time O(1) time
		boolean isTrue = false;
		int sum = 0;

		Arrays.sort(A);
		for (int i = 0; i < n - 2; i++) {
			int l = i + 1;
			int r = n - 1;
			while (l < r) {
				sum = A[i] + A[l] + A[r];
				if (sum == X) {
					isTrue = true;
					break;
				} else if (sum < X) {
					l++;
				} else {
					r--;
				}
				if (isTrue)
					break;
			}

		}
		return isTrue;
	}
}

