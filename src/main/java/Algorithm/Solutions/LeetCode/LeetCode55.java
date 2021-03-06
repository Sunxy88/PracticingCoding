package Algorithm.Solutions.LeetCode;

public class LeetCode55 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
