package Algorithm.Solutions.LeetCode;

public class LeetCode1770 {

    public int maximumScore(int[] nums, int[] multipliers) {
        int n, m;
        if (nums == null || multipliers == null || (n = nums.length) == 0 || (m = multipliers.length) == 0) {
            return 0;
        }

        int[][] dp = new int[m + 1][m + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + nums[i - 1] * multipliers[i - 1];
            dp[0][i] = dp[0][i - 1] + nums[n - i] * multipliers[i - 1];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j + i <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + nums[i - 1] * multipliers[i + j - 1],
                        dp[i][j - 1] + nums[n - j] * multipliers[i + j - 1]);
            }
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i <= m; i++) {
            res = Math.max(res, dp[i][m - i]);
        }

        return res;
    }

}
