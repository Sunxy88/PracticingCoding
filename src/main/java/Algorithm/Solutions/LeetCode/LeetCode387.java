package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;

        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < cs.length; i++) {
            if (map.containsKey(cs[i]))
                map.put(cs[i], -1);
            else
                map.put(cs[i], i);
        }

        int res = cs.length;
        for (Integer i : map.values()) {
            if (i != -1 && i < res)
                res = i;
        }

        return res == cs.length ? -1 : res;
    }
}
