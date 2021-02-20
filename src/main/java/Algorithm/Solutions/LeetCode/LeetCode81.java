package Algorithm.Solutions.LeetCode;

public class LeetCode81 {

    public boolean search(int[] nums, int target) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return false;
        }

        int l = 0, r = len - 1;
        while (l <= r) {
            int m = r + (l - r) / 2;

            if (target == nums[m]) {
                return true;
            }

            if (nums[l] == nums[m]) {
                l++;
                continue;
            }

            if (nums[l] < nums[m]) {
                if (nums[m] > target && nums[l] <= target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m] < target && nums[r] >= target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }

}
