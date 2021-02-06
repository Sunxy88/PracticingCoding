package Algorithm.Solutions.LeetCode;

public class LeetCode34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        int l = binarySearch(nums, target, true);
        int r = binarySearch(nums, target, false) - 1;
        if (l <= r && r < nums.length && nums[l] == target && nums[r] == target) {
            return new int[] {l, r};
        }
        return new int[] {-1, -1};
    }

    private int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        int mid;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
