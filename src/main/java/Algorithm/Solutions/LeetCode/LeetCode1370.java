package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode1370 {

    public String sortString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int[] bucket = new int[26];
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : cs) {
            bucket[c - 'a']++;
        }

        while (sb.length() < cs.length) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] > 0) {
                    sb.append((char) ('a' + i));
                    bucket[i]--;
                }
            }
            for (int i = bucket.length - 1; i >= 0; i--) {
                if (bucket[i] > 0) {
                    sb.append((char) ('a' + i));
                    bucket[i]--;
                }
            }
        }

        return sb.toString();
    }

}
