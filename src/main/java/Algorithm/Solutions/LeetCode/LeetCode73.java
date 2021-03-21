package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode73 {

    public void setZeroes(int[][] matrix) {
        int m, n;
        if (matrix == null || (m = matrix.length) == 0 || (n = matrix[0].length) == 0) {
            return;
        }

        Set<Integer> cols = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    cols.add(j);
                    rows.add(i);
                }
            }
        }


        for (Integer j : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][j] = 0;
            }
        }

        for (Integer i : rows) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
    }

}
