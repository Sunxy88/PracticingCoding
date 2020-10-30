package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1207 {

    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int val : map.values()) {
            if (set.contains(val)) {
                return false;
            }
            set.add(val);
        }
        return true;
    }

}
