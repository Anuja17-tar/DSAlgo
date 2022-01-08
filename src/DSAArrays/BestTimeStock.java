package DSAArrays;

public class BestTimeStock {

}

class Solution13 {
	public int maxProfit(int[] prices) {
		int minSoFar = prices[0];
		int maxProfit = 0;
		int maxP = 0;
		for (int i = 0; i < prices.length; i++) {

			minSoFar = Math.min(prices[i], minSoFar);

			maxP = prices[i] - minSoFar;
			maxProfit = Math.max(maxProfit, maxP);
		}
		return maxProfit;
	}
}
