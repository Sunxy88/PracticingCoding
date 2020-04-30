package Algorithm.Solutions.LeetCode;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int cand = nums[0], count = 0;
        for (int num : nums) {
            if (count == 0) {
                cand = num;
                count++;
            }
            else {
                if (num == cand)
                    count++;
                else
                    count--;
            }
        }
        return cand;
    }
}
