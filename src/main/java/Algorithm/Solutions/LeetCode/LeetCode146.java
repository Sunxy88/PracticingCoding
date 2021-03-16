package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146 {
    class LRUCache {

        class DListNode {
            DListNode prev;
            DListNode next;
            int key;
            int val;

            public DListNode() {}

            public DListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }

        private int capacity;
        private int size;
        private DListNode head;
        private DListNode tail;
        private Map<Integer, DListNode> map = new HashMap<>();


        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.head = new DListNode();
            this.tail = new DListNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DListNode node = map.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);
            return node.val;
        }

        public void put(int key, int value) {
            DListNode node = map.get(key);
            if (node == null) {
                node = new DListNode(key, value);
                map.put(key, node);
                addToHead(node);
                size++;
                if (size > capacity) {
                    DListNode t = removeTail();
                    map.remove(t.key, t);
                    size--;
                }
            } else {
                node.val = value;
                moveToHead(node);
            }
        }

        private void addToHead(DListNode node) {
            node.next = head.next;
            node.prev = head;
            head.next = node;
            node.next.prev = node;
        }

        private void removeNode(DListNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void moveToHead(DListNode node) {
            removeNode(node);
            addToHead(node);
        }

        private DListNode removeTail() {
            DListNode res = tail.prev;
            removeNode(res);
            return res;
        }
    }
}
