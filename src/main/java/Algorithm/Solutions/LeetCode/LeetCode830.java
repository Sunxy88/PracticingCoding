package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode830 {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }

        int startIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(startIndex)) {
                startIndex = i;
            } else if (i - startIndex >= 2) {
                while (i + 1 < s.length() && s.charAt(i + 1) == s.charAt(i)) {
                    i++;
                }
                res.add(Arrays.asList(startIndex, i));
                startIndex = i + 1;
            }
        }
        return res;
    }

}
