package Algorithm.Solutions.LeetCode;

public class LeetCode1318 {

    public int minFlips(int a, int b, int c) {

        int bit = 1;
        int aORb = a | b;
        int res = 0;

        while (bit <= c || bit <= aORb) {
            int bitANDc = bit & c, bitANDab = bit & aORb;
            if (bitANDc == bitANDab) {
                bit <<= 1;
                continue;
            } else {
                if (bitANDc == 0) {
                    if ((a & bit) != 0) {
                        res += 1;
                    }

                    if ((b & bit) != 0) {
                        res += 1;
                    }
                } else {
                    res += 1;
                }
                bit <<= 1;
            }
        }

        return res;
    }

}
