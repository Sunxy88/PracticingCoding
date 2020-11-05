package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode1356 {

    public int[] sortByBits(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int[][] toSort = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            toSort[i][0] = countNumberOfOne(arr[i]);
            toSort[i][1] = arr[i];
        }

        Arrays.sort(toSort, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            return e1[0] - e2[0];
        });

        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = toSort[i][1];
        }
        return res;
    }

    private int countNumberOfOne(int num) {
        int cnt = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                cnt++;
            }
            num /= 2;
        }
        return cnt;
    }

}
