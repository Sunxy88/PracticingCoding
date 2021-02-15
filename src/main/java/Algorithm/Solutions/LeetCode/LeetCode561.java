package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode561 {

    public int arrayPairSum(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int ans = 0;

        for (int i = 0; i <len; i += 2) {
            ans += nums[i];
        }

        return ans;
    }

}
