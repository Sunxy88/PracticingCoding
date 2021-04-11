package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode264 {
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> visited = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.offer(1L);
        visited.add(1L);
        int ugly = 0;

        for (int i = 0; i < n; i++) {
            long cur = pq.poll();
            ugly = (int) cur;
            for (int f : factors) {
                long next = f * cur;
                if (visited.add(next)) {
                    pq.offer(next);
                }
            }
        }

        return ugly;
    }
}