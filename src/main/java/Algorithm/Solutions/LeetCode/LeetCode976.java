package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode976 {

    public int largestPerimeter(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }

        return 0;
    }

}
