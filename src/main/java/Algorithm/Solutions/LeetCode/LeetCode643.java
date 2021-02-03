package Algorithm.Solutions.LeetCode;

public class LeetCode643 {

    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;
        int sum = 0;
        int res;

        while (r < k) {
            sum += nums[r++];
        }

        res = sum;

        while (r < nums.length) {
            sum -= nums[l++];
            sum += nums[r++];
            res = Math.max(res, sum);
        }

        return (double) res / k;
    }

}
