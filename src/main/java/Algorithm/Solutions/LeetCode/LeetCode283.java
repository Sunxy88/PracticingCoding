package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int cntZero = 0;

        for (int num : nums) {
            if (num == 0) {
                cntZero++;
            }
        }

        int ptrNonZero = 0;
        int ptr = 0;

        while (ptrNonZero < nums.length - cntZero) {
            while (ptr < nums.length && nums[ptr] == 0) {
                ptr++;
            }
            nums[ptrNonZero++] = nums[ptr++];
        }

        Arrays.fill(nums, nums.length - cntZero, nums.length, 0);
    }

}
