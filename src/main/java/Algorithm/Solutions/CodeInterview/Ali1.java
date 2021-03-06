package Algorithm.Solutions.CodeInterview;

import java.util.Scanner;

public class Ali1 {

    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while (T-- > 0) {
            n = in.nextInt();
            System.out.println(calc(n));
        }
    }

    private static int calc(int n) {
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
