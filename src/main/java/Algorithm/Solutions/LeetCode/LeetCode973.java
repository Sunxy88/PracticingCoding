package Algorithm.Solutions.LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode973 {

    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];

        if (points == null || points.length == 0) {
            return res;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(this::distanceHelper));

        for (int[] point : points) {
            pq.offer(point);
        }

        for (int i = 0; i < K; i++) {
            res[i] = pq.poll();
        }

        return res;
    }

    private double distanceHelper(int[] point) {
        return Math.pow(point[0], 2) + Math.pow(point[1], 2);
    }

}
