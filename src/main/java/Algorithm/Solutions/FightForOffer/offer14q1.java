package Algorithm.Solutions.FightForOffer;

public class offer14q1 {
    // dp算法，不是最优
//    public int cuttingRope(int n) {
//        if (n == 1) return 1;
//        if (n <= 0) return 0;
//
//        int[] dp = new int[n + 1];
//        dp[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            for (int j = 1; j <= i; j++)
//                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
//        }
//        return dp[n];
//    }
    //利用数学，可以得知这一段绳子最好3单位3单位地切
    public int cuttingRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int a = n / 3, b = n % 3;
        if (b == 2) return (int) Math.pow(3, a) * 2;
        if (b == 1) return (int) Math.pow(3, a - 1) * 4;
        return (int) Math.pow(3, a);
    }
}
