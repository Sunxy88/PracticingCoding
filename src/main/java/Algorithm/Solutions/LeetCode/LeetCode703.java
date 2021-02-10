package Algorithm.Solutions.LeetCode;

import java.util.PriorityQueue;

public class LeetCode703 {
}


class KthLargest {
    private int k;
    private PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            priorityQueue.offer(num);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
