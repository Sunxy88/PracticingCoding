package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode530 {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.pollFirst();
            nums.add(root.val);
            root = root.right;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size() - 1; i++) {
            int tmp = nums.get(i + 1) - nums.get(i);
            if (tmp < ans) {
                ans = tmp;
            }
        }

        return ans;
    }

}
