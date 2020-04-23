package Algorithm.Solutions.CodeInterview;

public class CodeInterview8Q11 {
    public int waysToChange(int n) {
        if (n == 0)
            return 0;

        int[] coins = new int[] {1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= n; i++) {
                if (i - coin < 0) continue;
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }

        return dp[n];
    }
}
