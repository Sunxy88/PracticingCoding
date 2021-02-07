package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        int dp = 0, res = nums[0];
        for (int num : nums) {
            dp = Math.max(dp + num, num);
            res = Math.max(res, dp);
        }

        return res;
    }

}
