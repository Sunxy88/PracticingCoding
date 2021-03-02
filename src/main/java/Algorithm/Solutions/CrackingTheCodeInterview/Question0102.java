package Algorithm.Solutions.CrackingTheCodeInterview;

import java.util.Map;
import java.util.HashMap;

public class Question0102 {

    public boolean CheckPermutation(String s1, String s2) {
        int len1, len2;

        if (s1 == null || s2 == null || (len1 = s1.length()) == 0 || (len2 = s2.length()) == 0) {
            return true;
        }

        if (len1 != len2) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap(len1);

        for (int i = 0; i < len1; i++) {
            char c = s1.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < len2; i++) {
            char c = s2.charAt(i);
            int cnt = counter.getOrDefault(c, 0);
            if (cnt == 0) {
                return false;
            }
            counter.put(c, cnt - 1);
        }

        return true;
    }

}
