package DSAArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.StringTokenizer;

class isSubset {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			StringTokenizer stt = new StringTokenizer(br.readLine());

			long n = Long.parseLong(stt.nextToken());
			long m = Long.parseLong(stt.nextToken());
			long a1[] = new long[(int) (n)];
			long a2[] = new long[(int) (m)];

			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a1[i] = Long.parseLong(inputLine[i]);
			}
			String inputLine1[] = br.readLine().trim().split(" ");
			for (int i = 0; i < m; i++) {
				a2[i] = Long.parseLong(inputLine1[i]);
			}

			Compute1 obj = new Compute1();
			System.out.println(obj.isSubset(a1, a2, n, m));

		}
	}
}
//} Driver Code Ends

//User function Template for Java

class Compute1 {
	public String isSubset(long a1[], long a2[], long n, long m) {
//Brute-force
//		int count = 0;
//		if (m <= n && m > 0 && n > 0) {
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < m; j++) {
//					if (a1[i] == a2[j]) {
//						count++;
//					}
//				}
//			}
//		}
//
//		if (count == m) {
//			return "Yes";
//		} else {
//			return "No";
//		}
		// using O(n) space and O(n) time
		Set<Long> s = new HashSet<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			s.add(a1[i]);
		}
		for (int i = 0; i < m; i++) {
			if (s.contains(a2[i])) {
				count++;
			}
		}
		if (count == m) {
			return "Yes";
		} else {
			return "No";
		}
	}
}