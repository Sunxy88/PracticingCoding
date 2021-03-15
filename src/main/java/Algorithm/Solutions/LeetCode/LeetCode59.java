package Algorithm.Solutions.LeetCode;

public class LeetCode59 {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int cnt = 1;

        while (cnt <= n * n) {
            for (int i = left; i <= right; i++) {
                res[top][i] = cnt++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                res[i][right] = cnt++;
            }
            if (top < bottom && left < right) {
                for (int i = right - 1; i >= left; i--) {
                    res[bottom][i] = cnt++;
                }
                for (int i = bottom - 1; i > top; i--) {
                    res[i][left] = cnt++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return res;
    }

}
