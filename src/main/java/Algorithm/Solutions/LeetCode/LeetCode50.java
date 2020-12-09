package Algorithm.Solutions.LeetCode;

public class LeetCode50 {

    private double quickMulHelper(double x, long n) {
        if (n == 1) {
            return x;
        }
        double half;
        if (n % 2 == 1) {
            half = quickMulHelper(x, n / 2);
            return half * half * x;
        } else {
            half = quickMulHelper(x, n / 2);
            return half * half;
        }
    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return quickMulHelper(x, N);
    }

}
