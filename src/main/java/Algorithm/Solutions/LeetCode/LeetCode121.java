package Algorithm.Solutions.LeetCode;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int len = prices.length - 1;
        int maxPrice = prices[len], profit = 0;

        for (int i = len; i >= 0; i--) {
            maxPrice = Math.max(maxPrice,prices[i]);
            profit = Math.max(profit, maxPrice - prices[i]);
        }
        return profit;
    }
}
