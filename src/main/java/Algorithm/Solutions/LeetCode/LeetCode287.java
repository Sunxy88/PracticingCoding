package Algorithm.Solutions.LeetCode;

public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int slow = nums[0];
        int fast = nums[slow];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
