package Algorithm.Solutions.FightForOffer;

public class offer65 {
    public int add(int a, int b) {
        int plus = a;
        while (b != 0) {
            plus = plus ^ b;
            b = (a & b) << 1;
            a = plus;
        }
        return plus;
    }
}
