package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new LinkedList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();

            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> element = map.getOrDefault(key, new ArrayList<>());
            element.add(str);
            map.put(key, element);
        }

        return new ArrayList<>(map.values());
    }
}
