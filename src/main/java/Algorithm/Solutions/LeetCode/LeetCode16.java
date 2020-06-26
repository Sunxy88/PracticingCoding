package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int best = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(best - target) > Math.abs(sum - target))
                    best = sum;
                if (sum == target) {
                    return target;
                }
                else if (sum > target) {
                    int tr = nums[r];
                    while (l < r && nums[r] == tr)
                        r--;
                }
                else {
                    int tl = nums[l];
                    while (l < r && nums[l] == tl)
                        l++;
                }
            }
        }
        return best;
    }
}
