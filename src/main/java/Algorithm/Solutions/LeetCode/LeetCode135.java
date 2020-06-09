package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode135 {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0)
            return 0;
        int[] left2right = new int[ratings.length], right2left = new int[ratings.length];
        Arrays.fill(left2right, 1);
        Arrays.fill(right2left, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                left2right[i] = left2right[i - 1] + 1;
            if (ratings[ratings.length - i - 1] > ratings[ratings.length - i])
                right2left[ratings.length - i - 1] = right2left [ratings.length - i] + 1;
        }
        int res = 0;
        for (int i = 0; i < ratings.length; i++) {
            res += Math.max(left2right[i], right2left[i]);
        }
        return res;
    }
}
