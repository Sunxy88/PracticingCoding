package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode60 {

    private boolean[] used;
    private int[] factorial;
    private int n;
    private int k;
    private StringBuilder res;

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        used = new boolean[n + 1];
        Arrays.fill(used, false);
        factorial = new int[n + 1];
        factorial[0] = 1;

        for (int i = 1; i < n + 1; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        res = new StringBuilder();
        dfs(0);

        return res.toString();
    }

    private void dfs(int index) {
        if (index == n)
            return;

        int cnt = factorial[n - 1 - index];
        for (int i = 1; i < n + 1; i++) {
            if (used[i]) continue;
            if (cnt < k) {
                k -= cnt;
                continue;
            }
            res.append(i);
            used[i] = true;
            dfs(index + 1);
        }
    }
}
