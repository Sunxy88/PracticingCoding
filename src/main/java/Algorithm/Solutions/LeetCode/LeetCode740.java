package Algorithm.Solutions.LeetCode;

public class LeetCode740 {

    public int deleteAndEarn(int[] nums) {
        int len;

        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }

        int maxElmt = Integer.MIN_VALUE;
        for (int num : nums) {
            maxElmt = Math.max(maxElmt, num);
        }

        int[] dp = new int[maxElmt + 1];
        int[] count = new int[maxElmt + 1];

        for (int num : nums) {
            count[num]++;
        }

        dp[1] = count[1];
        dp[2] = Math.max(dp[1], count[2] * 2);
        for (int i = 2; i <= maxElmt; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + count[i] * i);
        }

        return dp[maxElmt];
    }

}
