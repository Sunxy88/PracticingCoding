package Algorithm.Solutions.LeetCode;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int slowPtr = 0, fastPtr, t;

        while (slowPtr < nums.length) {
            if (nums[slowPtr] == val) {
                fastPtr = slowPtr + 1;
                while (fastPtr < nums.length && nums[fastPtr] == val)
                    fastPtr++;
                if (fastPtr == nums.length)
                    break;
                t = nums[slowPtr];
                nums[slowPtr] = nums[fastPtr];
                nums[fastPtr] = t;
                slowPtr++;
            } else {
                slowPtr++;
            }
        }
        return slowPtr;
    }
}
