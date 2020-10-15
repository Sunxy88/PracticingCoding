package Algorithm.Solutions.FightForOffer;

public class offer21 {

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public int[] exchange(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l < r) {
            while (l < r && nums[l] % 2 == 1) {
                l++;
            }
            while (l < r && nums[r] % 2 == 0) {
                r--;
            }
            if (l > r) {
                break;
            }
            swap(nums, l, r);
        }
        return nums;
    }
}
