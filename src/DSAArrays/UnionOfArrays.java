package DSAArrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UnionOfArrays {
	public static void main(String[] args) {

		// Taking input using class Scanner
		Scanner sc = new Scanner(System.in);

		// Taking total count of testcases
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {

			int n, m;

			// taking size of array a
			n = sc.nextInt();

			// taking size of array b
			m = sc.nextInt();

			// Creating 2 array of size n and m
			int a[] = new int[n];
			int b[] = new int[m];

			// inserting elements to array a
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			// inserting elements to array b
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			Solution6 ob = new Solution6();
			// calling doUnion method and printing the results
			System.out.println(ob.doUnion(a, n, b, m));
		}

	}
}// } Driver Code Ends

//User function Template for Java

class Solution6 {
	public static int doUnion(int a[], int n, int b[], int m) {
		int count = 0;
		Set<Integer> aSet = new HashSet<>();
		Set<Integer> bSet = new HashSet<>();
		for (int t : a) {
			aSet.add(t);
		}
		for (int u : b) {
			bSet.add(u);
		}
		aSet.addAll(bSet);
		return aSet.size();

	}

}
