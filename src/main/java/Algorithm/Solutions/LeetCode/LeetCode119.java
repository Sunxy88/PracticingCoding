package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex < 0)
            return res;
//
//        res.add(1);
//        for (int i = 0; i < rowIndex; i++) {
//            List<Integer> inter = new ArrayList<>(res);
//            res = new ArrayList<>();
//            res.add(1);
//            for (int j = 1; i > 0 && j < inter.size(); j++) {
//                res.add(inter.get(j - 1) + inter.get(j));
//            }
//            res.add(1);
//        }
//
//        return res;
        return recur(rowIndex);
    }

    private List<Integer> recur(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }

        if (rowIndex == 1) {
            res.add(1);
            res.add(1);
            return res;
        }

        List<Integer> last = recur(rowIndex - 1);
        for (int i = 0; i < rowIndex; i++) {
            res.add((i == 0 || i == rowIndex - 1) ? 1 : last.get(i - 1) + last.get(i));
        }
        return res;
    }
}
