package Algorithm.UsefulDataStructure.utils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import Algorithm.UsefulDataStructure.TreeNode;

public class TreeUtil {

    public static TreeNode generate(List<Integer> list) {
        if (list == null || list.size() == 0 || list.get(0) == null)
            return null;

        Deque<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(list.get(0)), cur;
        q.add(root);
        int ptr = 1;

        while (!q.isEmpty()) {
            if (ptr >= list.size()) break;
            cur = q.pollFirst();
            Integer val = list.get(ptr++);
            TreeNode left =  val == null ? null : new TreeNode(val);
            cur.left = left;
            if (left != null)
                q.addLast(left);

            if (ptr >= list.size()) break;
            val = list.get(ptr++);
            TreeNode right =  val == null ? null : new TreeNode(val);
            cur.right = right;
            if (right != null)
                q.addLast(right);
        }

        return root;
    }

    public static void trival(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        Deque<TreeNode> tmp = new LinkedList<>();
        q.addLast(root);
        TreeNode cur;

        while (!q.isEmpty()) {
            do {
                cur = q.pollFirst();
                if (cur != null) {
                    tmp.addLast(cur.left);
                    tmp.addLast(cur.right);
                    System.out.print(cur.val + " ");
                } else {
                    System.out.print("null ");
                }
            } while (!q.isEmpty());
            System.out.println();
            while (!tmp.isEmpty()) {
                q.addLast(tmp.pollFirst());
            }
        }
    }
}
