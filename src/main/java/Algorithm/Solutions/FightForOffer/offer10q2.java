package Algorithm.Solutions.FightForOffer;

public class offer10q2 {

    public int numWays(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int t = a + b;
            t %= 1000000007;
            a = b;
            b = t;
        }
        return b;
    }
}
