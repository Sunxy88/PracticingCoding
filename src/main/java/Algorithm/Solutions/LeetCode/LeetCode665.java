package Algorithm.Solutions.LeetCode;

public class LeetCode665 {

    public boolean checkPossibility(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return true;
        }

        int cnt = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i - 1]) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }

        return true;
    }

}
