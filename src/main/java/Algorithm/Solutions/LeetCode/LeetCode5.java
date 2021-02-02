package Algorithm.Solutions.LeetCode;

public class LeetCode5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String ans = "";

        for (int n = 0; n < len; n++) {
            for (int i = 0; i + n < len; i++) {
                int j = i + n;
                if (n == 0) {
                    dp[i][j] = true;
                } else if (n == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                if (dp[i][j] && n + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }

}
