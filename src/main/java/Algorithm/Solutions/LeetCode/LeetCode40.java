package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (candidates == null || candidates.length == 0)
            return res;


        Arrays.sort(candidates);
        dfs(candidates, target, res, new ArrayList<>(), 0);

        return res;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> path, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return ;
        }

        for (int i = start; i < candidates.length; i++) {
            if (target - candidates[i] < 0)
                break;
            // 去重剪枝
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], res, path, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
