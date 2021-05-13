package Algorithm.Solutions.LeetCode;

public class LeetCode1269 {

    public int numWays(int steps, int arrLen) {
        final int MODULO = 1000000007;
        int maxCol = Math.min(steps, arrLen - 1);
        int[] ndp = new int[maxCol + 1];
        ndp[0] = 1;

        for (int i = 1; i <= steps; i++) {
            int[] dpNext = new int[maxCol + 1];
            for (int j = 0; j <= maxCol; j++) {
                dpNext[j] = ndp[j];
                if (j - 1 >= 0) {
                    dpNext[j] = (dpNext[j] + ndp[j - 1]) % MODULO;
                }
                if (j + 1 <= maxCol) {
                    dpNext[j] = (dpNext[j] + ndp[j + 1]) % MODULO;
                }
            }
            ndp = dpNext;
        }

        return ndp[0];
    }

}
