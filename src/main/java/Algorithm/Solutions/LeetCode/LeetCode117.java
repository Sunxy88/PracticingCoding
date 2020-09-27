package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode117 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Deque<Node> q = new LinkedList<>();
        q.addLast(root);

        while (!q.isEmpty()) {
            int n = q.size();
            Node last = null;
            for (int i = 0; i < n; i++) {
                Node cur = q.pollFirst();
                if (cur.left != null) {
                    q.addLast(cur.left);
                }
                if (cur.right != null) {
                    q.addLast(cur.right);
                }
                if (i != 0) {
                    last.next = cur;
                }
                last = cur;
            }
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

}
