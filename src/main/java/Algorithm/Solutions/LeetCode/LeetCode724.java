package Algorithm.Solutions.LeetCode;

public class LeetCode724 {

    public int pivotIndex(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return -1;
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int sum2 = 0;
        for (int i = 0; i < len; i++) {
            if (2 * sum2 + nums[i] == sum) {
                return i;
            }
            sum2 += nums[i];
        }

        return -1;
    }

}
