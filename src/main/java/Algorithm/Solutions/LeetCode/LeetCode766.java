package Algorithm.Solutions.LeetCode;

public class LeetCode766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int m, n;
        if (matrix == null || (m = matrix.length) == 0 || (n = matrix[0].length) == 0) {
            return false;
        }

        int x, y;
        for (int i = 0; i + 1 < n; i++) {
            x = 1;
            y = i + 1;
            while (x < m && y < n) {
                if (matrix[x - 1][y - 1] != matrix[x][y]) {
                    return false;
                }
                x++;
                y++;
            }
        }
        for (int i = 0; i + 1 < m; i++) {
            x = i + 1;
            y = 1;
            while (x < m && y < n) {
                if (matrix[x - 1][y - 1] != matrix[x][y]) {
                    return false;
                }
                x++;
                y++;
            }
        }
        return true;
    }

}
