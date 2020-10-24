package Algorithm.Solutions.LeetCode;

public class LeetCode845 {

    public int longestMountain(int[] A) {
        int len = A.length;
        int ans = 0;
        int left = 0, right;

        while (left + 2 < len) {
            right = left + 1;
            if (A[left] < A[left + 1]) {
                while (right + 1 < len && A[right] < A[right + 1]) {
                    right++;
                }
                if (right + 1 < len && A[right] > A[right + 1]) {
                    while (right + 1 < len && A[right] > A[right + 1]) {
                        right++;
                    }
                    ans = Math.max(ans, right - left + 1);
                } else {
                    right++;
                }
            }
            left = right;
        }
        return ans;
    }

}
