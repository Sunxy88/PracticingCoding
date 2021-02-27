package Algorithm.Solutions.LeetCode;

public class LeetCode896 {

    public boolean isMonotonic(int[] A) {
        int len;

        if (A == null || (len = A.length) <= 2) {
            return true;
        }

        int  i = 1;
        while (i < len && A[i] == A[i - 1]) {
            i++;
        }

        if (i == len) {
            return true;
        }

        boolean increment = A[i] > A[i - 1];

        i = 1;
        while (i < len) {
            if (increment) {
                if (A[i] < A[i - 1]) {
                    return false;
                }
            } else {
                if (A[i] > A[i - 1]) {
                    return false;
                }
            }
            i++;
        }

        return true;
    }

}
