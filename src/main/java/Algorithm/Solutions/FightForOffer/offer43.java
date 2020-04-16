package Algorithm.Solutions.FightForOffer;

public class offer43 {
    public int countDigitOne(int n) {
        return recur(n);
    }

    private int recur(int n) {
        if (n <= 0) return 0;
        String s = n + "";
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length() - 1);
        int left = n - pow * high;
        if (high == 1)
            return recur(pow - 1) + left + 1 + recur(left);
        else
            return pow + high * recur(pow - 1) + recur(left);
    }
}
