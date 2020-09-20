package Algorithm.Solutions.LeetCodeCompet;

import java.util.HashMap;
import java.util.Map;

public class CompeteQuestion5504 {
    public int minSubarray(int[] nums, int p) {
        if (nums == null || nums.length == 0)
            return -1;

        int len = nums.length, res = Integer.MAX_VALUE;
        long[] prefixSum = new long[len + 1];
        Map<Long, Integer> prefixSumMap = new HashMap<>();


        for (int i = 1; i <= len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        long modulo = prefixSum[len] % p;

        if (modulo == 0)
            return 0;

        for (int i = 0; i <= len; i++) {
            Integer index = prefixSumMap.get((prefixSum[i] - modulo) % p);
            if (index != null) {
                res = Math.min(res, i - index);
            }
            prefixSumMap.merge(prefixSum[i] % p, i, Math::max);
        }

        return (res == Integer.MAX_VALUE || res == len) ? -1 : res;
    }
}
