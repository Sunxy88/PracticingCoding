package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode554 {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for (List<Integer> widths : wall) {
            int sum = 0;
            int n = widths.size();
            for (int i = 0; i < n - 1; i++) {
                sum += widths.get(i);
                cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            }
        }

        int cntMax = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            cntMax = Math.max(cntMax, entry.getValue());
        }

        return wall.size() - cntMax;
    }
}
