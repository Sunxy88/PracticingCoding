package Algorithm.Solutions.LeetCodeCompet;

import java.util.Arrays;

public class CompeteQuestion5550 {

    public int[] decrypt(int[] code, int k) {
        if (code == null || code.length == 0) {
            return code;
        }

        int len = code.length;
        int[] res = new int[len];
        if (k == 0) {
            Arrays.fill(res, 0);
        } else if (k > 0) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % len];
                }
                res[i] = sum;
            }
        } else {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = -1; j >= k; j--) {
                    int index = i + j;
                    if (index < 0) {
                        index += len;
                    }
                    sum += code[index % len];
                }
                res[i] = sum;
            }
        }

        return res;
    }

}
