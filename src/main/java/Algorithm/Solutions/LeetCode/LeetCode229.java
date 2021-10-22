package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = 0;
        if (nums == null || (len = nums.length) == 0) {
            return res;
        }
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }
        int finalLen = len;
        counter.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > finalLen / 3)
                .forEach(entry -> res.add(entry.getKey()));
        return res;
    }
}
