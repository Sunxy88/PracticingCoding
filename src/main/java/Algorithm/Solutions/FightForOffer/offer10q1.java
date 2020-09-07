package Algorithm.Solutions.FightForOffer;

public class offer10q1 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int t = (a + b) % 1000000007;
            a = b;
            b = t;
        }
        return b;
    }
}
