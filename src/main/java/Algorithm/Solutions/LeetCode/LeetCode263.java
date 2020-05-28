package Algorithm.Solutions.LeetCode;

public class LeetCode263 {
    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        int[] factor = new int[] {2, 3, 5};
        for (int f : factor) {
            while (num % f == 0)
                num = num / f;
        }
        return num == 1;
    }
}
