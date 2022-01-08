package DSAArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MinNumberOfSteps {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int size = Integer.parseInt(br.readLine());
			String[] arrStr = br.readLine().split("\\s+");
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(arrStr[i]);
			}
			System.out.println(new Solution9().minJumps(arr));
		}
	}

}
//} Driver Code Ends

class Solution9 {
	static int minJumps(int[] a) {
		int n = a.length;
		int step = a[0];
		int jump = 1;
		int maxR = a[0];
		if (n <= 1) {
			return 0;
		} else if (a[0] == 0) {
			return -1;
		} else {
			for (int i = 1; i < n; i++) {
				if (i == n - 1) {
					return jump;
				}
				maxR = Math.max(maxR, a[i] + i);
				step--;
				if (step == 0) {
					jump++;

					if (i >= maxR) {
						return -1;
					}
					step = maxR - i;
				}
			}
			return -1;
		}
	}
}
