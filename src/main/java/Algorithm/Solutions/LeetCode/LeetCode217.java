package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n))
                return true;
        }
        return false;
    }
}
