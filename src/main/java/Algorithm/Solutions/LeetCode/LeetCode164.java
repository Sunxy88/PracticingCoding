package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode164 {

    public int maximumGap(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) < 2) {
            return 0;
        }

        long exp = 1;
        int[] tmpAry = new int[len];
        int maxVal = Arrays.stream(nums).max().getAsInt();

        while (maxVal >= exp) {
//            Counting sort
            int[] bucket = new int[10];
            for (int num : nums) {
                int digit = (num / (int) exp) % 10;
                bucket[digit]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (int i = len - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) exp) % 10;
                tmpAry[bucket[digit] - 1] = nums[i];
                bucket[digit]--;
            }
            System.arraycopy(tmpAry, 0, nums, 0, len);
            exp *= 10;
        }

        int res = -1;
        for (int i = 1; i < len; i++) {
            res = Math.max(res, nums[i] - nums[i - 1]);
        }

        return res;
    }

}
