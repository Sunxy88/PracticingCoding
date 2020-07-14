package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0) return res;

        res.add(Collections.singletonList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> toAdd = new ArrayList<>();
            toAdd.add(1);
            for (int j = 1; j < i; j++) {
                toAdd.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            toAdd.add(1);
            res.add(toAdd);
        }
        return res;
    }
}
