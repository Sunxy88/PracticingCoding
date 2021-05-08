package Algorithm.Solutions.LeetCode;

public class LeetCode1482 {
    private int len;

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay == null || (len = bloomDay.length) < m * k) {
            return -1;
        }

        int low = 1, high = 1;
        for (int bd : bloomDay) {
            high = Math.max(bd, high);
        }

        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (canMake(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0, flowers = 0;

        for (int i = 0; i < len && bouquets < m; i++) {
            if (bloomDay[i] <= days) {
                flowers += 1;
                if (flowers == k) {
                    bouquets += 1;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

}
