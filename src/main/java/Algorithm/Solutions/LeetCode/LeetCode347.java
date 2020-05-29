package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];
        Map<Integer, Integer> frequency = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(frequency::get));
        int[] res = new int[k];

        for (int num : nums) {
            Integer fre = frequency.get(num);
            frequency.put(num, fre == null ? 1 : fre + 1);
        }

        for (int n : frequency.keySet()) {
            pq.offer(n);
            if (pq.size() > k)
                pq.poll();
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}
