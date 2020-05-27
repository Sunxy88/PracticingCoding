package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode239 {
    private Deque<Integer> dq = new LinkedList<>();
    private int[] nums;

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length * k == 0)
            return new int[0];
        if (k == 1)
            return nums;
        this.nums = nums;
        int i = 0;
        int[] res = new int[nums.length - k + 1];
        while (i < k) {
            cleanDq(i, k);
            dq.addLast(i);
            i++;
        }
        res[0] = nums[dq.peekFirst()];
        while (i < nums.length) {
            cleanDq(i, k);
            dq.addLast(i);
            res[i - k + 1] = nums[dq.peekFirst()];
            i++;
        }
        return res;
    }

    public void cleanDq(int i, int k) {
        if (!dq.isEmpty() && dq.getFirst() == i - k)
            dq.removeFirst();

        while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
            dq.pollLast();
    }
}
