package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode274 {
//    public int hIndex(int[] citations) {
//        if (citations == null || citations.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(citations);
//        int h = 0, n = citations.length;
//        for (int i = 0; i < n; i++) {
//            if (citations[i] >= n - i && h < n - i)
//                h = n - i;
//        }
//
//        return h;
//    }
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0)
            return 0;

        int n = citations.length;
        int[] papers = new int[n + 1];

        for (int c : citations)
            papers[Math.min(c, n)]++;

        int ans = n;
        for (int s = papers[n]; ans > s; s += papers[--ans]);

        return ans;
    }
}
