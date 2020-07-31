package Algorithm.Solutions.LeetCode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        int leftBound = 0, rightBound = Integer.MAX_VALUE;
        int range = rightBound - leftBound;
        int max = Integer.MIN_VALUE;
        int size = nums.size();
        int[] next = new int[size];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(o -> nums.get(o).get(next[o])));

        for (int i = 0; i < size; i++) {
            pq.offer(i);
            max = Math.max(max, nums.get(i).get(0));
        }

        while (true) {
            int minIndex = pq.poll();
            int curRange = max - nums.get(minIndex).get(next[minIndex]);
            if (curRange < range) {
                range = curRange;
                leftBound = nums.get(minIndex).get(next[minIndex]);
                rightBound = max;
            }
            next[minIndex]++;
            if (next[minIndex] == nums.get(minIndex).size())
                break;
            pq.offer(minIndex);
            max = Math.max(max, nums.get(minIndex).get(next[minIndex]));
        }

        return new int[] {leftBound, rightBound};
    }
}
