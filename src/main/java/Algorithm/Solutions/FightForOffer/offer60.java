package Algorithm.Solutions.FightForOffer;

import java.util.Arrays;

public class offer60 {
    public double[] twoSum(int n) {
        if (n < 1) return new double[0];
        double[] ans = new double[5 * n + 1];
        int[][] dp = new int[n + 1][6 * n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i <= 6; i++)
            dp[1][i] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k <= 0) break;
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        double pba = Math.pow(1.0 / 6, n);
        for (int i = n; i <= 6 * n; i++) {
            ans[i - n] = pba * dp[n][i];
        }
        return ans;
    }
}
