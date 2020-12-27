package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {

    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        int slen, tlen;
        if ((slen = s.length()) != (tlen = t.length())) {
            return false;
        }

        Map<Character, Character> stMap = new HashMap<>(slen);
        Map<Character, Character> tsMap = new HashMap<>(tlen);
        for (int i = 0; i < slen; i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if ((stMap.containsKey(sc) && stMap.get(sc) != tc) || (tsMap.containsKey(tc) && tsMap.get(tc) != sc)) {
                return false;
            }
            stMap.put(sc, tc);
            tsMap.put(tc, sc);
        }

        return true;
    }

}
