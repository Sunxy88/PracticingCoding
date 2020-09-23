package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode501 {

    private int base, cnt, maxCnt;
    private List<Integer> ans = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        TreeNode cur = root, pre;
        // Moris inorder trivial
        while (cur != null) {
            if (cur.left == null) {
                update(cur.val);
                cur = cur.right;
                continue;
            }
            pre = cur.left;
            while (pre.right != null && pre.right != cur) {
                pre = pre.right;
            }
            if (pre.right == null) {
                pre.right = cur;
                cur = cur.left;
            }
            else {
                pre.right = null;
                update(cur.val);
                cur = cur.right;
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i< res.length; i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    /**
     * Because in this question, all repeated elements are always together (a property of inorder trival of BST)
     */
    private void update(int x) {
        if (x == base) {
            ++cnt;
        }
        else {
            cnt = 1;
            base = x;
        }
        if (cnt == maxCnt) {
            ans.add(base);
        }
        if (cnt > maxCnt) {
            maxCnt = cnt;
            ans.clear();
            ans.add(base);
        }
    }
}
