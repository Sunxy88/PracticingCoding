package Algorithm.Solutions.FightForOffer;

public class offer49 {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[index2] * 2, Math.min(dp[index3] * 3, dp[index5] * 5));
            if (dp[i] == dp[index2] * 2) index2++;
            if (dp[i] == dp[index3] * 3) index3++;
            if (dp[i] == dp[index5] * 5) index5++;
        }
        return dp[n - 1];
    }
}
