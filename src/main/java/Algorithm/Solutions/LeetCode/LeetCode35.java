package Algorithm.Solutions.LeetCode;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int m, l = 0, r = n - 1;

        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) return m;
            else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        return l;
    }
}
