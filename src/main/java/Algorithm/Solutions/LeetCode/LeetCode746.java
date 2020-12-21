package Algorithm.Solutions.LeetCode;

public class LeetCode746 {

    public int minCostClimbingStairs(int[] cost) {
        int len;
        if (cost == null || (len = cost.length) <= 1) {
            return 0;
        }

        if (len == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int dp0 = 0, dp1 = 0;

        for (int i = 2; i <= len; i++) {
            int t = Math.min(dp0 + cost[i - 2], dp1 + cost[i - 1]);
            dp0 = dp1;
            dp1 = t;
        }

        return dp1;
    }

}
