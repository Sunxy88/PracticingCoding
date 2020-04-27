package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);

        int longest = 1, cur;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                cur = 1;
                int t = num + 1;
                while (set.contains(t)) {
                    cur++;
                    t++;
                }
                longest = Math.max(longest, cur);
            }
        }
        return longest;
    }
}
