package Algorithm.Solutions.LeetCode;

public class LeetCode33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int l = 0, r = nums.length - 1;
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] == target)
                return m;

            if (nums[0] <= nums[m]) {
                if (target >= nums[0] && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
            else {
                if (target > nums[m] && target <= nums[nums.length - 1])
                    l = m + 1;
                else
                    r = m - 1;
            }
        }
        return -1;
    }
}
