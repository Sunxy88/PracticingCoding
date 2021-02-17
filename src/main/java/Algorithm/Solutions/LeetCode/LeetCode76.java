package Algorithm.Solutions.LeetCode;

public class LeetCode76 {

    public String minWindow(String s, String t) {
        int[] tCounter = new int[52];
        int[] sCounter = new int[52];

        int sLen;
        if (s == null || t == null || (sLen = s.length()) == 0 || t.length() == 0) {
            return "";
        }

        int ansLen = Integer.MAX_VALUE, l = 0, r = -1;
        int ansL = -1, ansR = -1;

        for (char c : t.toCharArray()) {
            tCounter[indexOfChar(c)]++;
        }

        while (r < sLen) {
            r++;
            if (r < sLen && tCounter[indexOfChar(s.charAt(r))] > 0){
                sCounter[indexOfChar(s.charAt(r))]++;
            }

            while (meetTheGoal(tCounter, sCounter) && l <= r) {
                if (r - l + 1 < ansLen) {
                    ansLen = r - l + 1;
                    ansL = l;
                    ansR = r;
                }
                sCounter[indexOfChar(s.charAt(l))]--;
                l++;
            }
        }

        return ansL == -1 ? "" : s.substring(ansL, ansR + 1);
    }

    private int indexOfChar(char c) {
        if (Character.isUpperCase(c)) {
            return c - 'A' + 26;
        }
        return c - 'a';
    }

    private boolean meetTheGoal(int[] tCounter, int[] sCounter) {
        for (int i = 0; i < tCounter.length; i++) {
            if (tCounter[i] > 0 && sCounter[i] < tCounter[i]) {
                return false;
            }
        }
        return true;
    }
}
