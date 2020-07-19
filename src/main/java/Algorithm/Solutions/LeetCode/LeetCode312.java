package Algorithm.Solutions.LeetCode;

public class LeetCode312 {
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int[] numsWithBoundary = new int[n + 2];
        System.arraycopy(nums, 0, numsWithBoundary, 1, n);
        numsWithBoundary[0] = 1;
        numsWithBoundary[n + 1] = 1;

        n = numsWithBoundary.length;
        int[][] dp = new int[n][n];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 2; j < n; j++) {
                int max = 0;
                for (int k = i + 1; k < j; k++) {
                    int temp = dp[i][k] + dp[k][j] + numsWithBoundary[i] * numsWithBoundary[k] * numsWithBoundary[j];
                    if (temp > max)
                        max = temp;
                }
                dp[i][j] = max;
            }
        }

        return dp[0][n - 1];
    }
}
