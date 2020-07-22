package Algorithm.Solutions.LeetCode;

public class LeetCode154 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int l = 0, r = nums.length - 1;
        int m;

        while (l < r) {
            m = l + (r - l) / 2;
            if (nums[m] > nums[r]) l = m + 1;
            else if (nums[m] < nums[r]) r = m;
            else r = r - 1;
        }

        return nums[l];
    }
}
