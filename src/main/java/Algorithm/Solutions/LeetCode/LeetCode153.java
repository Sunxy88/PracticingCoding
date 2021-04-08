package Algorithm.Solutions.LeetCode;

public class LeetCode153 {
    public int findMin(int[] nums) {

        int len;
        if (nums == null || (len = nums.length) == 0) {
            return -1;
        }

        int l = 0, r = len - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}
