package Algorithm.Solutions.LeetCode;

public class LeetCode191 {

    public int hammingWeight(int n) {
        int cnt = 0;

        int mask = 1, i = 0;

        while (i < 32) {
            if ((n & mask) != 0) {
                cnt++;
            }
            mask <<= 1;
            i++;
        }

        return cnt;
    }

}
