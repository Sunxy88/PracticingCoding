package Algorithm.Solutions.LeetCode;

public class LeetCode264 {
    private Ugly u = new Ugly();
    public int nthUglyNumber(int n) {
        if (n <= 0)
            return 1;
        return u.getUgly(n - 1);
    }
}

class Ugly {
    private int[] nums = new int[1690];
    public Ugly() {
        int p2 = 0, p3 = 0, p5 = 0;
        nums[0] = 1;
        for (int i = 1; i < 1690; i++) {
            nums[i] = Math.min(Math.min(nums[p2] * 2, nums[p3] * 3), nums[p5] * 5);
            if (nums[i] == nums[p2] * 2) p2++;
            if (nums[i] == nums[p3] * 3) p3++;
            if (nums[i] == nums[p5] * 5) p5++;
        }
    }

    public int getUgly(int n) {
        return nums[n];
    }
}