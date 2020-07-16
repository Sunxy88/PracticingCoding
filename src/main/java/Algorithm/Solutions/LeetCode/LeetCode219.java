package Algorithm.Solutions.LeetCode;

import java.util.Map;
import java.util.HashMap;

public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1)
            return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            if (map.get(t) != null && i - map.get(t) <= k) {
                return true;
            } else {
                map.put(t, i);
            }
        }
        return false;
    }
}
