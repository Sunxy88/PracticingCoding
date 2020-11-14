package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5551 {

    public int minimumDeletions(String s) {
        int len = s.length();
        int[][] dp = new int[len + 1][2];

        for (int i = 1; i <= len; i++) {
            dp[i][0] = Integer.MIN_VALUE;
            dp[i][1] = Integer.MAX_VALUE;
            if (s.charAt(i - 1) == 'a') {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][1] + 1;
            } else {
                dp[i][0] = dp[i - 1][0] + 1;
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
        }

        return Math.min(dp[len][0], dp[len][1]);
    }
}
