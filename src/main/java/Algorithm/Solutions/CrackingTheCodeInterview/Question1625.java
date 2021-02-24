package Algorithm.Solutions.CrackingTheCodeInterview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Question1625 {
}

class LRUCache {

    private Map<Integer, LRUNode> nodeMap;
    private int size = 0;
    private int capacity;
    private LRUNode head, tail;

    public LRUCache(int capacity) {
        this.nodeMap = new HashMap<>(capacity);
        this.capacity = capacity;
        this.head = new LRUNode();
        this.tail = new LRUNode();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if (nodeMap.containsKey(key)) {
            LRUNode node = nodeMap.get(key);
            moveToHead(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        LRUNode node = nodeMap.get(key);
        if (node == null) {
            node = new LRUNode(key, value);
            nodeMap.put(key, node);
            addHead(node);
            size++;
            if (size > capacity) {
                LRUNode tail = removeTail();
                nodeMap.remove(tail.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    class LRUNode {
        int key;
        int val;
        LRUNode prev;
        LRUNode next;

        public LRUNode() {}

        public LRUNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private void addHead(LRUNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(LRUNode node) {
       node.prev.next = node.next;
       node.next.prev = node.prev;
    }

    private LRUNode removeTail() {
        LRUNode res = tail.prev;
        removeNode(res);
        return res;
    }

    private void moveToHead(LRUNode node) {
        removeNode(node);
        addHead(node);
    }
}