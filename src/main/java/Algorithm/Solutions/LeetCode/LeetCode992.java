package Algorithm.Solutions.LeetCode;

public class LeetCode992 {

    public int subarraysWithKDistinct(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }

        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }

    private int atMostKDistinct(int[] A, int K) {
        int len = A.length;
        int[] freq = new int[len + 1];

        int l = 0, r = 0;
        int cnt = 0, res = 0;

        while (r < len) {
            if (freq[A[r]] == 0) {
                cnt++;
            }
            freq[A[r]]++;
            r++;

            while (cnt > K) {
                freq[A[l]]--;
                if (freq[A[l]] == 0) {
                    cnt--;
                }
                l++;
            }

            res += r - l;
        }

        return res;
    }

}
