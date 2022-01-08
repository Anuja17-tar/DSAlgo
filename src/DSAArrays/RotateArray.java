package DSAArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RotateArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			int a[] = new int[n];
			// long getAnswer[] = new long[(int)(n)];
			String inputLine[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(inputLine[i]);
			}

			Compute obj = new Compute();
			obj.rotate(a, n);

			StringBuilder output = new StringBuilder();
			for (int i = 0; i < n; i++)
				output.append(a[i] + " ");
			System.out.println(output);

		}
	}
}

//} Driver Code Ends

//User function Template for Java

class Compute {

	public void rotate(int arr[], int n) {
		if (n > 1) {
			int temp = arr[0];
			arr[0] = arr[n - 1];

			for (int i = n; i > 1; i--) {
				arr[i - 1] = arr[i - 2];
			}
			arr[1] = temp;
		}
	}
}
