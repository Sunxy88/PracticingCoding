package Algorithm.Solutions.FightForOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class offer57q2 {
    public int[][] findContinuousSequence(int target) {
        if (target <= 0)
            return new int[0][0];
        int sum = 0;
        int l = 1, r = 1;
        List<int[]> ans = new LinkedList<>();
        while (l <= target / 2) {
            if (sum < target) {
                sum += r;
                r++;
            } else if (sum > target) {
                sum -= l;
                l++;
            } else {
                int[] ary = new int[r - l];
                for (int i = l; i < r; i++) {
                    ary[i - l] = i;
                }
                ans.add(ary);
                sum -= l;
                l++;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
