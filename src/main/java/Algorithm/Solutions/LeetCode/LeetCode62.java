package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode62 {
    // 其实本质就是杨辉三角。。。。
    public int uniquePaths(int m, int n) {
        if (m == 1) return 1;
        if (n == 1) return 1;
        int[][] dp = new int[m][n];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = 0;
            }
        }
        dp[m - 1][n - 1] = 1;
        dp[m - 2][n - 1] = 1;
        dp[m - 1][n - 2] = 1;
        dfs(m, n, 0, 0, dp);
        return dp[0][0];
    }

    private void dfs(int m, int n, int x, int y, int[][] dp) {
        if (x > m || y > n || dp[x][y] > 0) return;

        if (x + 1 < m && y + 1 < n) {
            if (dp[x + 1][y] == 0) dfs(m, n, x + 1, y, dp);
            if (dp[x][y + 1] == 0) dfs(m, n, x, y + 1, dp);
            dp[x][y] = dp[x + 1][y] + dp[x][y + 1];
        }
        else if (x + 1 < m) {
            if (dp[x + 1][y] == 0) dfs(m, n, x + 1, y, dp);
            dp[x][y] = dp[x + 1][y];
        }
        else if (y + 1 < n) {
            if (dp[x][y + 1] == 0) dfs(m, n, x, y + 1, dp);
            dp[x][y] = dp[x][y + 1];
        }
    }
}
