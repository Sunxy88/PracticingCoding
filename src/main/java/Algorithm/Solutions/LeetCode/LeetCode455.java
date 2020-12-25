package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode455 {

    public int findContentChildren(int[] g, int[] s) {
        int glen, slen;
        if (g == null || s == null || (glen = g.length) == 0 || (slen = s.length) == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int gptr = 0, sptr = 0;
        int cnt = 0;

        while (gptr < glen && sptr < slen) {
            if (g[gptr] <= s[sptr]) {
                gptr++;
                sptr++;
                cnt++;
            } else {
                sptr++;
            }
        }

        return cnt;
    }

}
