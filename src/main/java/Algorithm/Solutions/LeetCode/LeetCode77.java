package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        if (n == 0 || k == 0)
            return res;

        dfs(res, new ArrayList<>(), n, k, 1);

        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> curList, int n, int k, int cur) {
        if (curList.size() == k) {
            res.add(new ArrayList<>(curList));
            return;
        }

        for (int i = cur; i <= n; i++) {
            curList.add(i);
            dfs(res, curList, n, k, i + 1);
            curList.remove(curList.size() - 1);
        }
    }
}
