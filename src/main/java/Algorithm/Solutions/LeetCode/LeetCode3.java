package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> lastIndex = new HashMap<>();
        int res = 0;

        for (int start = 0, end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastIndex.containsKey(c)) {
                int last = lastIndex.get(c);
                if (last >= start) {
                    start = last + 1;
                }
            }
            res = Math.max(res, end - start + 1);
            lastIndex.put(c, end);
        }

        return res;
    }

}
