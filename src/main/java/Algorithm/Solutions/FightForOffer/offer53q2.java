package Algorithm.Solutions.FightForOffer;

public class offer53q2 {

    public int missingNumber(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        int l = 0, r = len - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
    }

}
