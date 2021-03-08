package Algorithm.Solutions.CrackingTheCodeInterview;

import java.util.HashMap;
import java.util.Map;

public class Question0104 {
    public boolean canPermutePalindrome(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) {
            return true;
        }

        Map<Character, Integer> counter = new HashMap<>(len);

        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        boolean oddAlready = false;
        for (Integer cnt : counter.values()) {
            if (cnt % 2 == 1) {
                if (oddAlready) {
                    return false;
                } else {
                    oddAlready = true;
                }
            }
        }

        return true;
    }
}
