package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode1024 {

//    DP
    public int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            for (int[] clip : clips) {
                if (clip[0] < i && i <= clip[1]) {
                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE - 1 ? -1 : dp[T];
    }

//    Greedy
//    public int videoStitching(int[][] clips, int T) {
//        int[] maxn = new int[T];
//        for (int[] clip : clips) {
//            if (clip[0] < T) {
//                maxn[clip[0]] = Math.max(maxn[clip[0]], clip[1]);
//            }
//        }
//        int maximum = 0, res = 0, lastPos = 0;
//        for (int i = 0; i < T; i++) {
//            maximum = Math.max(maximum, maxn[i]);
//            if (maximum == i) {
//                return -1;
//            }
//            if (i == lastPos) {
//                res++;
//                lastPos = maximum;
//            }
//        }
//        return res;
//    }

}
