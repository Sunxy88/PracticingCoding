package Algorithm.Solutions.LeetCode;

public class LeetCode330 {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int i = 0, count = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i];
                i++;
            } else {
                miss += miss;
                count++;
            }
        }
        return count;
    }
}
