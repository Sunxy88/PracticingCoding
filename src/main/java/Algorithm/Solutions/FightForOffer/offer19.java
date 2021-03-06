package Algorithm.Solutions.FightForOffer;

public class offer19 {

    public boolean isMatch(String s, String p) {
        int n, m;
        if (s == null || p == null || (n = s.length()) == 0 || (m = p.length()) == 0) {
            return false;
        }
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (match(s, p, i, j - 1)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    if (match(s, p, i, j)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }

        return dp[n][m];
    }

    private boolean match(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }

        if (p.charAt(j - 1) == '.') {
            return true;
        }

        return p.charAt(j - 1) == s.charAt(i - 1);
    }

}
