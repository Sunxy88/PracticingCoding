package Algorithm.Solutions.LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class LeetCode46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length == 0)
            return res;

        boolean[] visited = new boolean[nums.length];

        Arrays.fill(visited, false);
        dfs(nums,visited, new LinkedList<>(), res);

        return res;
    }

    private void dfs(int[] nums, boolean[] visited, List<Integer> toAdd, List<List<Integer>> res) {
        if (toAdd.size() == nums.length) {
            res.add(new LinkedList<>(toAdd));
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if (! visited[i]) {
                toAdd.add(nums[i]);
                visited[i] = true;
                dfs(nums, visited, toAdd, res);
                visited[i] = false;
                toAdd.remove(toAdd.indexOf(nums[i]));
            }
        }
    }
}
