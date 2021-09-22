package Algorithm.Solutions.CodeInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Tencent {

    public static void main(String[] args) {
        question2();
    }

    private static void question2() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        final int MOD = 1000000007;
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] balls = new int[n];
            for (int i = 0; i < n; i++) {
                balls[i] = sc.nextInt();
            }

            Arrays.sort(balls);
            long ans = 0;
            for (int i = balls.length - 1; i >= 0; i--) {
                ans += (ans + balls[i]) % MOD;
            }

            System.out.println(ans % MOD);
        }
    }
}
