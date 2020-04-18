package Algorithm.Solutions.LeetCode;

public class LeetCode72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        if (n * m == 0)
            return n + m;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++)
            dp[i][0] = i;

        for (int i = 0; i < dp[0].length; i++)
            dp[0][i] = i;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1] - 1);
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }
        return dp[m][n];
    }
}
