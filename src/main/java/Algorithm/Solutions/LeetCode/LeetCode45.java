package Algorithm.Solutions.LeetCode;

public class LeetCode45 {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int len = nums.length, farestPosition = 0, nextPosition = 0, steps = 0;
        for (int i = 0; i < len - 1; i++) {
            farestPosition = Math.max(farestPosition, i + nums[i]);
            if (i == nextPosition) {
                nextPosition = farestPosition;
                steps++;
            }
        }
        return steps;
    }
}
