package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode452 {

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (a, b) -> (a[0] == b[0] ? (a[1] > b[1] ? 1 : -1) : (a[0] > b[0] ? 1 : -1)));

        List<int[]> merge = new ArrayList<>();
        merge.add(points[0]);

        for (int[] p : points) {
            int[] lastOne = merge.get(merge.size() - 1);
            if (lastOne != null && lastOne[1] >= p[0]) {
                lastOne[0] = Math.max(lastOne[0], p[0]);
                lastOne[1] = Math.min(lastOne[1], p[1]);
            } else {
                lastOne = p;
                merge.add(lastOne);
            }
        }

        return merge.size();
    }

}
