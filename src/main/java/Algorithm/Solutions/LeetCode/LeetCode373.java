package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new LinkedList<>();
        k = Math.min(k, nums1.length * nums2.length);
        if (k == 0)
            return res;

        Queue<Node> q = new PriorityQueue<>((o1, o2) -> o1.getVal() + nums2[o1.getIndex()] - (o2.getVal() + nums2[o2.getIndex()]));

        for (int value : nums1) q.offer(new Node(value, 0));

        while (k-- > 0) {
            res.add(Arrays.asList(q.peek().getVal(), nums2[q.peek().getIndex()]));
            Node t = q.poll();
            t.setIndex(t.getIndex() + 1);
            if (t.getIndex() != nums2.length)
                q.offer(t);

        }
        return res;
    }
}

class Node {
    private int val;
    private int index;

    public Node(int val, int index) {
        this.val = val;
        this.index = index;
    }

    public int getVal() {
        return val;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int i) {
        this.index = i;
    }
}
