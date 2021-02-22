package Algorithm.Solutions.SortForInterview;

public class ShellSort {

    public static void sort(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return;
        }

        int gap = len / 2;
        while (gap > 0) {
            for (int i = 0; i< len; i += gap) {
                for (int j = i; (j - gap) >= 0; j -= gap) {
                    if (nums[j] < nums[j - gap]) {
                        swap(nums, j, j - gap);
                    } else {
                        break;
                    }
                }
            }
            gap /= 2;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
