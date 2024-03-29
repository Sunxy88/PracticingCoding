package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode581 {

    public int findUnsortedSubarray(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int l = nums.length, r = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                l = Math.min(l, stack.pop());
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                r = Math.max(r, stack.pop());
            }
            stack.push(i);
        }

        return r - l > 0 ? r - l + 1 : 0;
    }

}
