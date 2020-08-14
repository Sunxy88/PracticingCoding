package Algorithm.Solutions.LeetCode;

public class LeetCode546 {

    public int removeBoxes(int[] boxes) {
        if (boxes == null || boxes.length == 0)
            return 0;
        int[][][] dp = new int[100][100][100];
        return removeHelper(dp, boxes, 0, boxes.length - 1, 0);
    }

    private int removeHelper(int[][][] dp, int[] boxes, int l, int r, int k) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];

        while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }

        dp[l][r][k] = removeHelper(dp, boxes, l, r - 1, 0) + (k + 1) * (k + 1);

        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(dp[l][r][k], removeHelper(dp, boxes, l, i, k + 1)
                        + removeHelper(dp, boxes, i + 1, r - 1, 0));
            }
        }

        return dp[l][r][k];
    }
}
