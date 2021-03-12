package Algorithm.Solutions.LeetCode;

import java.util.Iterator;
import java.util.LinkedList;

public class LeetCode705 {
}

class MyHashSet {

    public static final int BASE = 997;
    private LinkedList<Integer>[] buckets;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.buckets = new LinkedList[BASE];

        for (int i = 0; i < BASE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int h = hash(key);
        Iterator<Integer> iterable = buckets[h].iterator();
        while (iterable.hasNext()) {
            Integer ele = iterable.next();
            if (ele == key) {
                return;
            }
        }
        buckets[h].offerLast(key);
    }

    public void remove(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = buckets[h].iterator();

        while (iterator.hasNext()) {
            Integer ele = iterator.next();
            if (ele == key) {
                buckets[h].remove(ele);
                return;
            }
        }

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = buckets[h].iterator();

        while (iterator.hasNext()) {
            Integer ele = iterator.next();
            if (ele == key) {
                return true;
            }
        }

        return false;
    }

    private static int hash(int key) {
        return key % BASE;
    }
}
