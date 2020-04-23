package Algorithm.Solutions.FightForOffer;

public class offer51 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        return mergePartition(nums, 0, nums.length - 1);
    }

    private int mergePartition(int[] nums, int left, int right) {
        if (left >= right)
            return 0;
        int pairs = 0;
        int mid = (left + right) / 2;
        pairs += mergePartition(nums, left, mid);
        pairs += mergePartition(nums, mid + 1, right);
        pairs += merge(nums, left, right, mid + 1);
        return pairs;
    }

    private int merge(int[] nums, int left, int right, int mid) {
        if (left >= right)
            return 0;

        int[] temp = new int[right - left + 1];
        int lPtr= left, rPtr = mid;
        int index = 0;
        int pairs = 0;
        while (lPtr < mid && rPtr <= right) {
            if (nums[lPtr] <= nums[rPtr]) {
                temp[index++] = nums[lPtr++];
            }
            else {
                pairs += mid - lPtr;
                temp[index++] = nums[rPtr++];
            }
        }
        while (lPtr < mid) {
            temp[index++] = nums[lPtr++];
        }
        while (rPtr <= right) {
            temp[index++] = nums[rPtr++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);
        return pairs;
    }
}
