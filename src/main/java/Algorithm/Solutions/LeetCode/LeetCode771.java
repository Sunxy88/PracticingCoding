package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode771 {

    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        int res = 0;

        for (Character c : J.toCharArray()) {
            jewels.add(c);
        }

        for (Character c : S.toCharArray()) {
            if (jewels.contains(c)) {
                res++;
            }
        }

        return res;
    }
}
