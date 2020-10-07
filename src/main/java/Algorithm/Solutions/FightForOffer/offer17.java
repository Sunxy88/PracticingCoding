package Algorithm.Solutions.FightForOffer;

public class offer17 {

    public int[] printNumbers(int n) {
        int limit = fastPow(10, n) - 1;

        int[] res = new int[limit];

        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }

        return res;
    }

    private int fastPow(int n, int m) {
        int res = 1;
        while (m > 0) {
            if ((m & 1) == 1) {
                res *= n;
            }
            n *= n;
            m >>= 1;
        }
        return res;
    }

}
