package Algorithm.Solutions.LeetCode;

public class LeetCode64 {
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;

        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i - 1];
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i - 1][0];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + grid[i - 1][j], dp[i][j - 1] + grid[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1] + grid[grid.length - 1][grid[0].length - 1];
    }
}
