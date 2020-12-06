package Algorithm.Solutions.LeetCodeCompet;

import java.math.BigInteger;

public class CompeteQuestion5620 {

    public int concatenatedBinary(int n) {
        long res = 0;
        int M = 1_000_000_007;
        int shift = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & i - 1) == 0) {
                shift++;
            }
            res = ((res << shift) % M + i) % M;
        }

        return (int) res;
    }

}
