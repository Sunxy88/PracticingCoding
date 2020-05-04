package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int res = Integer.MIN_VALUE;
        int imax = 1, imin = 1;

        for (int num : nums) {
            if (num < 0) {
                int t = imin;
                imin = imax;
                imax = t;
            }
            imin = Math.min(num, imin * num);
            imax = Math.max(num, imax * num);
            res = Math.max(res, imax);
        }
        return res;
    }
}
