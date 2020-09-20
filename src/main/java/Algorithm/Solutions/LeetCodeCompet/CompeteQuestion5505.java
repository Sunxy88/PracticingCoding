package Algorithm.Solutions.LeetCodeCompet;

import java.util.Arrays;

public class CompeteQuestion5505 {

    /**
     * 差分数组使用在对数组区间频繁增减的操作
     */
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int len = nums.length;
        int[] diff = new int[len + 1];
        for (int[] r : requests) {
            diff[r[0]]++;
            diff[r[1] + 1]--;
        }

        for (int i = 0; i < len; i++) {
            diff[i + 1] += diff[i];
        }

        diff = Arrays.copyOf(diff, len);
        Arrays.sort(diff);
        Arrays.sort(nums);

        long sum = 0;
        final int mod = 1000000007;
        for (int i = 0; i < len; i++) {
            sum += (long)diff[i] * nums[i];
            sum %= mod;
        }
        return (int)sum;
    }
}