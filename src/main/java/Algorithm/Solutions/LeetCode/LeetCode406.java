package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode406 {

    public int[][] reconstructQueue(int[][] people) {
        int len = people.length;

        Arrays.sort(people, (p1, p2) -> {
            if (p1[0] != p2[0]) {
                return p1[0] - p2[0];
            } else {
                return p2[1] - p1[1];
            }
        });

        int[][] res = new int[len][];

        for (int[] p : people) {
            int space = p[1] + 1;
            for (int i = 0; i < len; i++) {
                if (res[i] == null) {
                    space--;
                    if (space == 0) {
                        res[i] = p;
                        break;
                    }
                }
            }
        }

        return res;
    }

}
