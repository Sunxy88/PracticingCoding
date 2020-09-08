package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LeetCode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (candidates == null || candidates.length == 0)
            return res;

        // 为剪枝作准备
        Arrays.sort(candidates);

        dfs(res, target, new ArrayList<>(), 0, candidates, 0);

        return res;
    }

    private void dfs(List<List<Integer>> res, int target, List<Integer> path, int sum, int[] candidates, int start) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // 剪枝
            if (sum + candidates[i] > target)
                break;
            path.add(candidates[i]);
            sum += candidates[i];
            dfs(res, target, path, sum, candidates, i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}
