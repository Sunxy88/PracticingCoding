package Algorithm.Solutions.FightForOffer;

import java.util.Deque;
import java.util.LinkedList;

public class offer59q1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len;
        if (nums == null || k == 0 || (len = nums.length) == 0) {
            return new int[0];
        }

        int[] res = new int[len - k + 1];
        int cnt = 0;
        Deque<Integer> window = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (!window.isEmpty() && i - window.peekFirst() >= k) {
                window.pollFirst();
            }
            while (!window.isEmpty() && nums[i] > nums[window.peekLast()]) {
                window.pollLast();
            }
            window.offer(i);
            if (i >= k - 1) {
                res[cnt++] = nums[window.peekFirst()];
            }
        }

        return res;
    }

}
