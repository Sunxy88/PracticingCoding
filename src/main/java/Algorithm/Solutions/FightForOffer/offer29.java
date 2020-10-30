package Algorithm.Solutions.FightForOffer;

public class offer29 {

    public int[] spiralOrder(int[][] matrix) {
        int m, n;
        if (matrix == null || (m = matrix.length) == 0 || (n = matrix[0].length) == 0) {
            return new int[]{};
        }

        int[] res = new int[m * n];
        int left = 0, right = n - 1, top = 0, bottom = m - 1, cnt = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res[cnt++] = matrix[top][i];
            }
            for (int j = top + 1; j <= bottom; j++) {
                res[cnt++] = matrix[j][right];
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    res[cnt++] = matrix[bottom][i];
                }
                for (int j = bottom; j > top; j--) {
                    res[cnt++] = matrix[j][left];
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
