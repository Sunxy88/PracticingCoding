package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for (String str : strs) {
            Arrays.fill(count, 0);
            for (Character c : str.toCharArray())
                count[c - 'a']++;
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append(i);
            }
            String key = sb.toString();
            if (map.containsKey(key))
                map.get(key).add(str);
            else {
                List<String> toAdd = new LinkedList<>();
                toAdd.add(str);
                map.put(key, toAdd);
            }
        }
        return new ArrayList<>(map.values());
    }
}
