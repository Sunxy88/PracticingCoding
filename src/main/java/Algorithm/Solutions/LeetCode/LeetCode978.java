package Algorithm.Solutions.LeetCode;

public class LeetCode978 {

    public int maxTurbulenceSize(int[] arr) {
        int len;
        if (arr == null || (len = arr.length) == 0) {
            return 0;
        }

        int up = 1, down = 1;
        int res = 1;

        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]) {
                up = down + 1;
                down = 1;
            } else if (arr[i] < arr[i - 1]) {
                down = up + 1;
                up = 1;
            } else {
                up = 1;
                down = 1;
            }
            res = Math.max(res, Math.max(up, down));
        }

        return res;
    }

}
