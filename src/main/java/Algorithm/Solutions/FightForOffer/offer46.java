package Algorithm.Solutions.FightForOffer;

public class offer46 {

    public int translateNum(int num) {
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 1;
        char[] c = Integer.toString(num).toCharArray();

        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] == '0' || Integer.valueOf(c[i - 1] + "" + c[i]) > 25) {
                dp[i + 1] = dp[i];
            } else {
                dp[i + 1] = dp[i] + dp[i - 1];
            }
        }

        return dp[c.length];
    }

}
