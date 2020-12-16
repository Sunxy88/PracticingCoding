package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode290 {

    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (split.length != pattern.length()) {
            return false;
        }

        String[] map = new String[26];
        Set<String> alreadyMapped = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            String word = split[i];
            if (map[index] == null) {
                if (alreadyMapped.contains(word)) {
                    return false;
                }
                map[index] = word;
                alreadyMapped.add(word);
            } else {
                if (!map[index].equals(word)) {
                    return false;
                }
            }
        }

        return true;
    }

}
