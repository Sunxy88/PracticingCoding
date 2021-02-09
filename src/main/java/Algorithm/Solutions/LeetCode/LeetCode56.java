package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {

    public int[][] merge(int[][] intervals) {
        int len;
        if (intervals == null || (len = intervals.length) == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (o1, o2)-> o1[0] -o2[0]);

        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int l = intervals[i][0], r = intervals[i][1];
            int size = merged.size();
            if (size == 0 || merged.get(size - 1)[1] < l) {
                merged.add(new int[] {l, r});
            } else {
                merged.get(size - 1)[1] = Math.max(merged.get(size - 1)[1], r);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

}
