package Algorithm.Solutions.LeetCode;

public class LeetCode338 {

    public int[] countBits(int num) {
        int[] bits = new int[num + 1];

        int highBit = 0;
        for (int i = 1; i < num + 1; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }

        return bits;
    }

}
