package Algorithm.Solutions.LeetCode;

public class LeetCode977 {

    public int[] sortedSquares(int[] A) {
        if (A == null) {
            return A;
        }

        int len = A.length;
        int[] res = new int[len];
        int l = 0, r = 0;

        if (A[0] >= 0) {
            for (int i = 0; i < len; i++) {
                res[i] = A[i] * A[i];
            }
            return res;
        } else if (A[len - 1] <= 0) {
            for (int i = len - 1; i >= 0; i--) {
                res[len - 1 - i] = A[i] * A[i];
            }
            return res;
        } else {
            for (int i = 0; i < len - 1; i++) {
                if (A[i] < 0 && A[i + 1] >= 0) {
                    l = i;
                    r = i + 1;
                    break;
                }
            }
        }

        int i = 0;

        while (l >= 0 && r <= len - 1) {
            int numl = Math.abs(A[l]), numr = Math.abs(A[r]);
            if (numl < numr) {
                res[i++] = numl * numl;
                l--;
            } else {
                res[i++] = numr * numr;
                r++;
            }
        }

        while (r <= len - 1) {
            res[i++] = A[r] * A[r];
            r++;
        }

        while (l < len - 1 && l >= 0) {
            res[i++] = A[l] * A[l];
            l--;
        }

        return res;
    }

}
