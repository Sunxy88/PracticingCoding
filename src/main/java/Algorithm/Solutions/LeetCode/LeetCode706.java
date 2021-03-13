package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;

public class LeetCode706 {
}


class MyHashMap {

    private static final int BASE = 997;
    private ArrayList<int[]>[] map;

    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new ArrayList[BASE];
        for (int i = 0; i < BASE; i++) {
            map[i] = new ArrayList<>();
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int h = hash(key);
        ArrayList<int[]> bucket = map[h];
        int i = 0;

        while (i < bucket.size()) {
            int[] entry = bucket.get(i++);
            if (entry[0] == key) {
                entry[1] = value;
                return;
            }
        }
        bucket.add(new int[] {key, value});
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int h = hash(key);
        ArrayList<int[]> bucket = map[h];
        int i = 0;

        while (i < bucket.size()) {
            int[] entry = bucket.get(i++);
            if (entry[0] == key) {
                return entry[1];
            }
        }

        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int h = hash(key);
        ArrayList<int[]> bucket = map[h];
        int i = 0;

        while (i < bucket.size()) {
            int[] entry = bucket.get(i++);
            if (entry[0] == key) {
                bucket.remove(entry);
                return;
            }
        }
    }

    private static int hash(int key) {
        return key % BASE;
    }
}