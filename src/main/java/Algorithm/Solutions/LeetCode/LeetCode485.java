package Algorithm.Solutions.LeetCode;

public class LeetCode485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int ans = 0;
        int curAns = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                curAns += 1;
            } else {
                ans = Math.max(ans, curAns);
                curAns = 0;
            }
        }
        ans = Math.max(ans, curAns);
        return ans;
    }

}
