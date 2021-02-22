package Algorithm.Solutions.SortForInterview;

public class InsertSort {

    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return ;
        }

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    j--;
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
}
