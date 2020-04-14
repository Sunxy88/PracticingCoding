package Algorithm.Solutions.FightForOffer;

public class offer15 {
    public int hammingWeight(int n) {
        int bit = 1;
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & bit) != 0) cnt++;
            bit <<= 1;
        }
        return cnt;
    }
}
