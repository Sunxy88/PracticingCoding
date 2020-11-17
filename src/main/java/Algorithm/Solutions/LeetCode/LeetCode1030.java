package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1030 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[i * C + j] = new int[] {i, j};
            }
        }

        Arrays.sort(res, Comparator.comparingInt(e -> Math.abs(e[0] - r0) + Math.abs(e[1] - c0)));

        return res;
    }

}
