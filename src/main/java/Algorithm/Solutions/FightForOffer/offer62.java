package Algorithm.Solutions.FightForOffer;

public class offer62 {
    public int lastRemaining(int n, int m) {
        int pos = 0;
        for (int i = 2; i <= n; i++)
            pos = (pos + m) % i;
        return pos;
    }
}
