package Algorithm.Solutions.LeetCode;

public class LeetCode983 {
    public int mincostTickets(int[] days, int[] costs) {
        if (days == null || days.length == 0) return 0;
        int[] dp = new int[365 + 32];
        int index = days.length - 1;

        for (int i = 365; i >= 0; i--) {
            if (index >= 0 && days[index] == i) {
                dp[i] = Math.min(costs[0] + dp[i + 1], Math.min(costs[1] + dp[i + 7], costs[2] + dp[i + 30]));
                index--;
            } else {
                dp[i] = dp[i + 1];
            }
        }

        return dp[0];
    }
}