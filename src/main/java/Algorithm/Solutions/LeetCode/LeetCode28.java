package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        int n = haystack.length(), m = needle.length();
        if (m == 0) return 0;
        if (n == 0) return -1;

        int[] next = new int[m];
        next[0] = -1;

        for (int k = -1, j = 0; j < m - 1; ) {
            if (k == -1 || needle.charAt(k) == needle.charAt(j)) {
                ++k;
                ++j;
                next[j] = k;
            }
            else {
                k = next[k];
            }
        }

        System.out.println(Arrays.toString(next));

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                ++i;
                ++j;
            }
            else {
                j = next[j];
            }
        }
        if (j == m)
            return i - m;
        return -1;
    }
}
