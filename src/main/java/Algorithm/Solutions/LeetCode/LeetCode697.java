package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode697 {

    public int findShortestSubArray(int[] nums) {

        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        Map<Integer, List<Integer>> valueToIndex = new HashMap<>();
        int degree = 0;

        for (int i = 0; i < len; i++) {
            List<Integer> index = valueToIndex.getOrDefault(nums[i], new ArrayList<>());
            index.add(i);
            valueToIndex.put(nums[i], index);
            degree = Math.max(degree, index.size());
        }

        int ans = Integer.MAX_VALUE;
        for (List<Integer> index : valueToIndex.values()) {
            if (index.size() == degree) {
                index.sort((o1, o2) -> o1 - o2);
                ans = Math.min(ans, index.get(index.size() - 1) - index.get(0) + 1);
            }
        }

        return ans;
    }
}
