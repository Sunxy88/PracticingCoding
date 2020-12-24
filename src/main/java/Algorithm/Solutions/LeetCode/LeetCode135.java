package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode135 {
    public int candy(int[] ratings) {
        int len;
        if (ratings == null || (len = ratings.length) == 0) {
            return 0;
        }

        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        int right = 1, res = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1 && ratings[i] > ratings[i + 1]) {
                right = right + 1;
            } else {
                right = 1;
            }
            res += Math.max(left[i], right);
        }

        return res;
    }
}
