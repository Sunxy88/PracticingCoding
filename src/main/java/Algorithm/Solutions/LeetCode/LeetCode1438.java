package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1438 {

    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> qMax = new LinkedList<>();
        Deque<Integer> qMin = new LinkedList<>();

        int len = nums.length;
        int l = 0, r = 0;
        int ans = 0;

        while (r < len) {
            while (!qMax.isEmpty() && qMax.peekLast() < nums[r]) {
                qMax.pollLast();
            }
            qMax.addLast(nums[r]);

            while (!qMin.isEmpty() && qMin.peekLast() > nums[r]) {
                qMin.pollLast();
            }
            qMin.addLast(nums[r]);

            while (!qMax.isEmpty() && !qMin.isEmpty() && qMax.peekFirst() - qMin.peekFirst() > limit) {
                if (nums[l] == qMin.peekFirst()) {
                    qMin.pollFirst();
                }
                if (nums[l] == qMax.peekFirst()) {
                    qMax.pollFirst();
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }

}
