package Algorithm.Solutions.LeetCode;

public class LeetCode115 {

    public int numDistinct(String s, String t) {
        int lenS, lenT;
        if (s == null || t == null || (lenS = s.length()) == 0 || (lenT = t.length()) == 0 || lenS < lenT) {
            return 0;
        }

        int[][] dp = new int[lenS + 1][lenT + 1];

        for (int i = 0; i <= lenT; i++) {
            dp[i][lenT] = 1;
        }

        for (int i = lenS - 1; i >= 0; i--) {
            char sc = s.charAt(i);
            for (int j = lenT - 1; j >= 0; j--) {
                char tc = t.charAt(j);
                if (sc == tc) {
                    dp[i][j] = dp[i +1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }

        return dp[0][0];
    }

}
