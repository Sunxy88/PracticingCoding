package Algorithm.Solutions.LeetCode;

public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] res = new int[nums.length];
        int product = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= product;
            product = product * nums[i];
        }
        return res;
    }
}
