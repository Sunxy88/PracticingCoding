package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode75 {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return ;
        int pt0 = 0, pt2 = nums.length - 1, cur = 0;
        int tmp;
        while (cur <= pt2) {
            if (nums[cur] == 0) {
                tmp = nums[cur];
                nums[cur++] = nums[pt0];
                nums[pt0++] = tmp;
            }
            else if (nums[cur] == 1)
                cur++;
            else {
                tmp = nums[cur];
                nums[cur] = nums[pt2];
                nums[pt2--] = tmp;
            }
        }
    }
}
