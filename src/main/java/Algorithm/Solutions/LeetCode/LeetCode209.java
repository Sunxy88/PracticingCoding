package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode209 {
    public int minSubArrayLen(int s, int[] nums) {
        //O(n)=nlogn:
//        if (nums == null || nums.length == 0)
//            return 0;
//
//        int ans = Integer.MAX_VALUE;
//        int[] sums = new int[nums.length + 1];
//
//        for (int i = 1; i < sums.length; i++)
//            sums[i] = sums[i - 1] + nums[i - 1];
//
//        for (int i = 1; i < sums.length; i++) {
//            int target = s + sums[i - 1];
//            int bound = Arrays.binarySearch(sums, target);
//            if (bound < 0)
//                bound = - bound - 1;
//            if (bound < sums.length)
//                ans = Math.min(ans, bound - i + 1);
//        }
//        return ans == Integer.MAX_VALUE ? 0 : ans;

        // O(n) = n
        if (nums == null || nums.length == 0)
            return 0;

        int l = 0, r = 0, sum = 0, ans = Integer.MAX_VALUE;

        while (r < nums.length) {
            sum += nums[r];
            while (sum >= s) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
