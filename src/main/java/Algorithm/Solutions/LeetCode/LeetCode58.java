package Algorithm.Solutions.LeetCode;

public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int cnt = 0;
        int i = s.length() - 1;
        for ( ; i >= 0; i--) {
            if (s.charAt(i) != ' ') break;
        }
        while (i >= 0) {
            if (s.charAt(i) == ' ') break;
            cnt++;
            i--;
        }
        return cnt;
    }
}
