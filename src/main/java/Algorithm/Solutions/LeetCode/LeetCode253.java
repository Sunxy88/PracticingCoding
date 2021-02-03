package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode253 {

    public int minMeetingRooms(int[][] intervals) {
        int len;
        if (intervals == null || (len = intervals.length) == 0) {
            return 0;
        }

        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        q.offer(intervals[0]);

        for (int i = 1; i < len; i++) {
            int[] top= q.peek();
            if (top[1] <= intervals[i][0]) {
                q.poll();
            }
            q.offer(intervals[i]);
        }

        return q.size();
    }

}
