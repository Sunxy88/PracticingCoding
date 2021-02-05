package Algorithm.Solutions.LeetCode;

public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return;
        }

        int i = len - 2, j = len - 1, k = len - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }
        if (i >= 0) {
            while (nums[k] <= nums[i]) {
                k--;
            }
            swap(nums, k, i);
        }
        reverse(nums, j);
    }

    private void swap(int[]arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private void reverse(int[] arr, int start) {
        int left = start, right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
