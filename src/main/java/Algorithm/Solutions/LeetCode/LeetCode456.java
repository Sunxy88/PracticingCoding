package Algorithm.Solutions.LeetCode;

import java.util.TreeMap;

public class LeetCode456 {

    public boolean find132pattern(int[] nums) {
        int len;
        if (nums == null || (len = nums.length) < 3) {
            return false;
        }

        int leftMin = nums[0];

        TreeMap<Integer, Integer> rightAll = new TreeMap<>();

        for (int i = 2; i < len; i++) {
            rightAll.put(nums[i], rightAll.getOrDefault(nums[i], 0) + 1);
        }

        for (int j = 1; j < len - 1; ++j) {
            if (leftMin < nums[j]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }

        return false;
    }

}
