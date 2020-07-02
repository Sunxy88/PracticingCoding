package Algorithm.Solutions.LeetCode;

public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int n = nums.length;
        if (n <= 2)
            return n;
        int toCover = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 1;
            if (count <= 2)
                nums[toCover++] = nums[i];
        }
        return toCover;
    }
}
