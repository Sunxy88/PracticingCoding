package Algorithm.Solutions.FightForOffer;

public class offer03 {
    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[nums[i]] == nums[i])
                return nums[i];
            swap(nums, i, nums[i]);
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
