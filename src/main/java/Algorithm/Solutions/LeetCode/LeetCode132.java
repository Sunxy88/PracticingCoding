package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode132 {

    private boolean[][] isPanlidrome;
    private int len;

    public int minCut(String s) {
        len = s.length();
        isPanlidrome = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            Arrays.fill(isPanlidrome[i], true);
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                isPanlidrome[i][j] = (s.charAt(i) == s.charAt(j)) && isPanlidrome[i + 1][j - 1];
            }
        }


        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i = 0; i < len; i++) {
            if (isPanlidrome[0][i]) {
                dp[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (isPanlidrome[j + 1][i]) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }

        return dp[len - 1];
    }
}
