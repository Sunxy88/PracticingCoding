package Algorithm.Solutions.FightForOffer;

public class offer42 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int dp = 0;
        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            dp = Math.max(dp + num, num);
            ans = Math.max(ans, dp);
        }
        return ans;
    }

}
