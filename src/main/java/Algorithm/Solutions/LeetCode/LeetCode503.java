package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LeetCode503 {

    public int[] nextGreaterElements(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return nums;
        }

        int[] res = new int[len];
        Arrays.fill(res, -1);
        Deque<Integer> monoStack = new ArrayDeque<>();
        for (int i = 0; i < 2 * len - 1; i++) {
            while (!monoStack.isEmpty() && nums[monoStack.peek()] < nums[i % len]) {
                res[monoStack.pop()] = nums[i % len];
            }
            monoStack.push(i % len);
        }

        return res;
    }

}
