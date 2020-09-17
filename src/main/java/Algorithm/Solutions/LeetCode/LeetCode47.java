package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode47 {

    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;

        used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);

        dfs(res, new ArrayList<>(), nums);

        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, int[] nums) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            cur.add(nums[i]);
            used[i] = true;
            dfs(res, cur, nums);
            used[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
}
