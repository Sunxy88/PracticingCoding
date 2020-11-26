package Algorithm.Solutions.SortForInterview;

public class CountingSort {

    public static int[] intSort(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return nums;
        }
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        int[] count = new int[maxVal - minVal + 1];

        for (int num : nums) {
            count[num - minVal]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] sorted = new int[len];

        for (int i = nums.length - 1; i >= 0; i--) {
            sorted[--count[nums[i] - minVal]] = nums[i];
        }

        return sorted;
    }
}
