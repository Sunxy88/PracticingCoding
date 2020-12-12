package Algorithm.Solutions.LeetCode;

public class LeetCode376 {

    public int wiggleMaxLength(int[] nums) {
        int len;
        if ((len = nums.length) < 2) {
            return len;
        }

        int up = 1, down = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                up = Math.max(up, down + 1);
            } else if (nums[i] < nums[i - 1]) {
                down = Math.max(up + 1, down);
            }
        }

        return Math.max(up, down);
    }

}
