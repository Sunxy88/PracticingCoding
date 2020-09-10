package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 0 || n == 0)
            return res;

        dfs(res, new ArrayList<>(), 1, k, n, 0);

        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, int start, int k, int n, int sum) {
        if (k == 0) {
            if (sum == n) {
                res.add(new ArrayList<>(path));
            }
            return ;
        }

        for (int i = start; i <= 9; i++) {
            if (sum + i > n) break;
            path.add(i);
            sum += i;
            dfs(res, path, i + 1, k - 1, n, sum);
            sum -= i;
            path.remove(path.size() - 1);
        }
    }
}
