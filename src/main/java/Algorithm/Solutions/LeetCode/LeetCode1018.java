package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1018 {

    public List<Boolean> prefixesDivBy5(int[] A) {
        int len;
        List<Boolean> res = new ArrayList<>();

        if (A == null || (len = A.length) == 0) {
            return res;
        }

        int lastNum = 0;
        for (int i = 0; i < len; i++) {
            lastNum *= 2;
            lastNum += A[i];
            lastNum %= 10;
            if (lastNum % 5 == 0) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }

}
