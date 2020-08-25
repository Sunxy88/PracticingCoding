package Algorithm.Solutions.FightForOffer;

public class offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int x = m - 1, y = 0;

        while (x >= 0 && y < n) {
            if (target == matrix[x][y]) {
                return true;
            } else if (target < matrix[x][y]) {
                x--;
            } else {
                y++;
            }
        }

        return false;
    }
}
