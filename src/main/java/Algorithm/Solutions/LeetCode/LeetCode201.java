package Algorithm.Solutions.LeetCode;

public class LeetCode201 {

    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            shift++;
        }
        m <<= shift;
        return m;
    }

}
