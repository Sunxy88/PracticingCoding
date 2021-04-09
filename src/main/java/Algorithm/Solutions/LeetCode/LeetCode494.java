package Algorithm.Solutions.LeetCode;

public class LeetCode494 {

//    Solution 1
//    private int cnt = 0;
//
//    public int findTargetSumWays(int[] nums, int S) {
//        int len;
//        if (nums == null || (len = nums.length) == 0) {
//            return 0;
//        }
//
//        dfs(nums, S, 0, 0);
//
//        return cnt;
//    }
//
//    private void dfs(int[] nums, int S, int curIndex, int curSum) {
//        if (curIndex == nums.length) {
//            if (curSum == S) {
//                cnt += 1;
//            }
//            return;
//        }
//
//        dfs(nums, S, curIndex + 1, curSum + nums[curIndex]);
//        dfs(nums, S, curIndex + 1, curSum - nums[curIndex]);
//    }

//    Solution 2
    public int findTargetSumWays(int[] nums, int S) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        int[][] dp = new int[len][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] += 1;

        for (int i = 1; i < len; i++) {
            for (int sum = -1000; sum <= 1000; sum++) {
                if (dp[i - 1][sum + 1000] != 0) {
                    dp[i][sum + 1000 + nums[i]] += dp[i - 1][sum + 1000];
                    dp[i][sum + 1000 - nums[i]] += dp[i - 1][sum + 1000];
                }
            }
        }

        return S > 1000 ? 0 : dp[nums.length - 1][S + 1000];
    }

}
