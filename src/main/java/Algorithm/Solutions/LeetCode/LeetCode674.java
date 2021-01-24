package Algorithm.Solutions.LeetCode;

public class LeetCode674 {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 1, cur = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                cur++;
                res = Math.max(res, cur);
            } else {
                cur = 1;
            }
        }

        return res;
    }

}
