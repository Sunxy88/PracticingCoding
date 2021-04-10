package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode560 {

    public int subarraySum(int[] nums, int k) {
        int len;
        if (nums == null || (len = nums.length) == 0) {
            return 0;
        }

        int res = 0;
        int prefixSum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();

        sumMap.put(0, 1);
        for (int i = 0; i < len; i++) {
            prefixSum += nums[i];
            if (sumMap.containsKey(prefixSum - k)) {
                res += sumMap.get(prefixSum - k);
            }
            sumMap.put(prefixSum, sumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return res;
    }

}
