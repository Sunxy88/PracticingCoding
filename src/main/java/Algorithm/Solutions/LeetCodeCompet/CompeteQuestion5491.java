package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5491 {

    public int diagonalSum(int[][] mat) {
        int sum = 0;

        if (mat == null || mat.length == 0)
            return sum;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (mat.length - 1 - i != i)
                sum += mat[i][mat.length - 1 - i];
        }

        return sum;
    }
}
