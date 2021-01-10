package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        int start = nums[0], end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num - end == 1) {
                end = num;
            } else {
                if (start == end) {
                    res.add(start + "");
                } else {
                    res.add(start + "->" + end);
                }
                start = end = num;
            }
        }

        if (start == end) {
            res.add(start + "");
        } else {
            res.add(start + "->" + end);
        }

        return res;
    }

}
