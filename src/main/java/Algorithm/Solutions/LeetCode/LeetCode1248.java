package Algorithm.Solutions.LeetCode;

public class LeetCode1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        int len = nums.length, feed = 0;
        int[] odd = new int[len + 2];

        for (int i = 0; i < len; i++) {
            if ((nums[i] & 1) == 1)
                odd[++feed] = i;
        }

        odd[0] = -1;
        odd[feed + 1] = len;
        int ans = 0;

        for (int i = 1; i + k < feed + 2; i++) {
            ans += (odd[i] - odd[i - 1]) * (odd[i + k] - odd[i + k - 1]);
        }
        return ans;
    }
}
