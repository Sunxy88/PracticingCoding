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

        for (int i = 0; i < len - 1; i++) {
            if (leftMin < nums[i]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[i]) {
                    return true;
                }
            }
            leftMin = nums[i];
            rightAll.put(nums[i + 1], rightAll.get(nums[i + 1] - 1));
            if (rightAll.get(nums[i + 1]) == 0) {
                rightAll.remove(nums[i + 1]);
            }
        }

        return false;
    }

}
