package Algorithm.Solutions.LeetCode;

public class LeetCode1411 {

    public int numOfWays(int n) {
        if (n == 1) {
            return 12;
        }

        long x = 6, y = 6;
        for (int i = 2; i <= n; i++) {
            long nx = (x * 3 + y * 2) % 1000000007;
            long ny = (x * 2 + y * 2) % 1000000007;
            x = nx;
            y = ny;
        }

        return (int) ((x + y) % 1000000007);
    }

}
