package Algorithm.Solutions.FightForOffer;

public class offer53q1 {

    public int search(int[] nums, int target) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        int l = 0, r = len - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] >= target) {
                r = m;
            }
        }

        int cnt = 0;
        if (r < len && target == nums[r]) {
            for (int i = r; i < len && nums[i] == target; i++) {
                cnt++;
            }
        }

        return cnt;
    }

}
