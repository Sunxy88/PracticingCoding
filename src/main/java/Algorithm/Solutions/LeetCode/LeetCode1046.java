package Algorithm.Solutions.LeetCode;


import java.util.PriorityQueue;

public class LeetCode1046 {

    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int s : stones) {
            heap.offer(s);
        }

        while (heap.size() > 1) {
            int s1 = heap.poll(), s2 = heap.poll();
            heap.offer(Math.abs(s1 - s2));
        }

        return heap.peek();
    }
}
