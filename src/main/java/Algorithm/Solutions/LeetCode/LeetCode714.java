package Algorithm.Solutions.LeetCode;

public class LeetCode714 {

    public int maxProfit(int[] prices, int fee) {
        int len;
        if (prices == null || (len = prices.length) == 0) {
            return 0;
        }

        int dp0 = 0;
        int dp1 = -prices[0];
        for (int i = 1; i < len; i++) {
            dp0 = Math.max(dp0, dp1 - fee + prices[i]);
            dp1 = Math.max(dp1, dp0 - prices[i]);
        }

        return dp0;
    }

}
