package Algorithm.Solutions.LeetCode;

public class LeetCode509 {

    public int fib(int n) {
        int a = 0, b = 1;
        if (n == 0) {
            return a;
        }

        for (int i = 1; i < n; i++) {
            int t = a + b;
            a = b;
            b = t;
        }

        return b;
    }

}
