package Algorithm.Solutions.LeetCode;

public class LeetCode213 {

    public int rob(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            return Math.max(rob(nums, 0, len - 2), rob(nums, 1, len - 1));
        }
    }

    private int rob(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start + 1], nums[start]);

        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }

        return second;
    }

}
