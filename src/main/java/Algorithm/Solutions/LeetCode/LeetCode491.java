package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode491 {
    private int[] Nums;
    private int len;
    private Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        this.Nums = nums;
        this.len = nums.length;
        for (int i = 0; i < len; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(Nums[i]);
            dfs(i, temp);
        }
        return new ArrayList<>(res);
    }

    private void dfs(int index, List<Integer> temp) {
        for (int i = index + 1; i < len; i++) {
            if (Nums[i] >= Nums[index]) {
                temp.add(Nums[i]);
                res.add(new ArrayList<>(temp));
                dfs(i, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
