package Algorithm.Solutions.LeetCode;

public class LeetCode303 {
}

class NumArray {

    private int[] result;

    public NumArray(int[] nums) {
        this.result = new int[nums.length + 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + nums[i - 1];
        }

    }

    public int sumRange(int i, int j) {
        return result[j + 1] - result[i];
    }
}