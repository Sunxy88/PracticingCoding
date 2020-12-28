package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode188 {

    public int maxProfit(int k, int[] prices) {
        int len;
        if (prices == null || (len = prices.length) == 0) {
            return 0;
        }
        k = Math.min(k, len / 2);
        int[][] buy = new int[len][k + 1];
        int[][] sell = new int[len][k + 1];

        buy[0][0] = -prices[0];
        sell[0][0] = 0;
        for (int i = 1; i <= k; i++) {
            buy[0][i] = sell[0][i] = Integer.MIN_VALUE;
        }

        for (int i = 1; i < len; i++) {
            buy[i][0] = Math.max(buy[i - 1][0], sell[i - 1][0] - prices[i]);
            for (int j = 1; j <= k; j++) {
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j] - prices[i]);
                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);
            }
        }

        return Arrays.stream(sell[len - 1]).max().getAsInt();
    }

}
