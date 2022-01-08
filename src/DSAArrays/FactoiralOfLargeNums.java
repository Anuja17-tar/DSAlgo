package DSAArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class FactoiralOfLargeNums {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			Solution17 ob = new Solution17();
			ArrayList<Integer> ans = ob.factorial(N);
			for (Integer val : ans)
				System.out.print(val);
			System.out.println();
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Solution17 {
	static ArrayList<Integer> factorial(int N) {
		List<Integer> num = Collections.singletonList(1);
		for (int i = 1; i <= N; i++) {
			num = multiply(i, num);
		}
		return (ArrayList<Integer>) num;

	}

	public static List<Integer> multiply(int multiplier, List<Integer> num) {
		int carry = 0;
		List<Integer> s = new ArrayList<>();
		for (int i = num.size() - 1; i >= 0; i--) {
			int mul = carry + (num.get(i) * multiplier);
			int rem = mul % 10;
			s.add(rem);
			carry = mul / 10;
		}
		while (carry != 0) {
			s.add(carry % 10);
			carry = carry / 10;
		}
		Collections.reverse(s);
		return s;
	}
}

