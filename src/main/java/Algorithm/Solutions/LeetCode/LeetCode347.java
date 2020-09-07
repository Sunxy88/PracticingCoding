package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int[] res = new int[k];
        Map<Integer, Integer> freqmap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> freqmap.get(o2) - freqmap.get(o1));

        for (Integer num : nums) {
            Integer freq = freqmap.get(num);
            freqmap.put(num, freq == null ? 1 : freq + 1);
        }

        for (Integer num : freqmap.keySet()) {
            pq.offer(num);
        }

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}
