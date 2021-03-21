package Algorithm.Solutions.CodeInterview;

import java.util.*;

/**
 * 3月21日笔试第二题
 * 通过50%，数组越界（dp map太大，估计是空间不够了）
 */
public class Tencent5 {

    private static Map<Long, Integer> dp = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        dp.put(1L, 1);
        dp.put(2L, 2);
        dp.put(3L, 2);
        while (T-- > 0) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    private static int solve(long n) {
       if (dp.containsKey(n)) {
           return dp.get(n);
       }

       int res = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            res = Math.min(res, solve(n / 3) + 1) ;
        }
        if (n % 2 == 0) {
            res = Math.min(res, solve(n / 2) + 1) ;
        }
        res = Math.min(res, solve(n - 1) + 1);
        dp.put(n, res);
        return res;
    }
}
