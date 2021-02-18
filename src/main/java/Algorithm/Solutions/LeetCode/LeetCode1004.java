package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode1004 {

    public int longestOnes(int[] A, int K) {

        int len;
        if (A == null || (len = A.length) == 0) {
            return 0;
        }

        if (len <= K) {
            return len;
        }

        int l = 0, r = 0;
        Deque<Integer> zeroIndex = new ArrayDeque<>(K);
        int ans = 0;
        int zerCnt = 0;

        while (r < len) {
            if (A[r] != 1) {
                zerCnt++;
                if (!zeroIndex.isEmpty() && zeroIndex.size() >= K) {
                    ans = Math.max(ans, r - l);
                    l = zeroIndex.pollFirst() + 1;
                }
                if (zeroIndex.isEmpty()) {
                    l++;
                }
                zeroIndex.addLast(r);
            }
            r++;
        }
        if (zerCnt <= K) {
            return len;
        }
        ans = Math.max(ans, r - l);
        return ans;
    }

}
