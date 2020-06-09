package Algorithm.Solutions.LeetCode;

public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0)
            return true;
        if (t == null || t.length() == 0)
            return false;

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int ptr = 0;

        for (char c : ct) {
            if (c == cs[ptr])
                ptr++;
            if (ptr == cs.length)
                return true;
        }

        return false;
    }
}
