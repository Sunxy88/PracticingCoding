package Algorithm.Solutions.SortForInterview;

public class MergeSort {

    public static void sort(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return;
        }
        divide(nums, 0 , len - 1);
    }

    private static void divide(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (r + l) / 2;
        divide(nums, l, m);
        divide(nums, m + 1, r);
        conquer(nums, l, m, r);
    }

    private static void conquer(int[] nums, int l, int m, int r) {
        int ptrL = l, ptrR = m + 1;
        int[] tempAry = new int[r - l + 1];
        int ptr = 0;
        while (ptrL <= m && ptrR <= r) {
            tempAry[ptr++] = nums[ptrL] < nums[ptrR] ? nums[ptrL++] : nums[ptrR++];
        }
        while (ptrL <= m) {
            tempAry[ptr++] = nums[ptrL++];
        }
        while (ptrR <= r) {
            tempAry[ptr++] = nums[ptrR++];
        }
        System.arraycopy(tempAry, 0, nums, l, r - l + 1);
    }
}
