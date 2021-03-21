package Algorithm.Solutions.CodeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baidu3 {

    private static final int MOD = 1000000007;

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println(dfs(0, n, m,0, 0));
    }

    private static int dfs(int cur, int n, int m, int pre1, int pre2) {
        if (cur == n) {
            return 1;
        }

        if (cur > n) {
            return 0;
        }

        String key = cur + ", " + pre1 + ", " + pre2;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int res = 0;
        for (int i = 1; i <= m; i++) {
            if (i != pre1 && i != pre2) {
                res += dfs(cur + i, n, m, i, pre1);
            }
        }
        res %= MOD;
        map.put(key, res);
        return res;
    }
}
