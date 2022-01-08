package DSAArrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BestTimeStockMoreThanOnce {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			System.out.println(new Solution23().maxProfit(arr, n));
		}
	}
}

//peak valley solution
class Solution23 {

	public int maxProfit(int[] arr, int n) {
		int profit = 0;


		PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] > 0) {
				profit = arr[i] - arr[i - 1];
				ans.add(profit);
			}
		}
		int profit1 = ans.poll();
		int profit2 = ans.poll();

		return profit1 + profit2;
	}

}
