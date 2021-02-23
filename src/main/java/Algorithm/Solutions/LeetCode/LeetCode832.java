package Algorithm.Solutions.LeetCode;

public class LeetCode832 {

    public int[][] flipAndInvertImage(int[][] A) {
        int m, n;
        if (A == null || (m = A.length) == 0 || (n = A[0].length) == 0) {
            return A;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(A[i], j, n - j - 1);
            }
            for (int j = 0; j < n; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }

        return A;
    }

    private void swap(int[] ary, int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

}
