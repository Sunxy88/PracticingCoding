package Algorithm.Solutions.CrackingTheCodeInterview;

import java.util.HashSet;
import java.util.Set;

public class Question0101 {
    public boolean isUnique(String astr) {
        int len;
        if (astr == null || (len = astr.length()) == 0) {
            return true;
        }

        Set<Character> set = new HashSet<>();

        for (char c : astr.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;
    }
}