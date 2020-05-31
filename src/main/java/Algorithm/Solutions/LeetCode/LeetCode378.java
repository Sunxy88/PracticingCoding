package Algorithm.Solutions.LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode378 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0)
            return 0;

        int n = matrix.length - 1;
        int left = matrix[0][0], right = matrix[n][n];
        while (left < right) {
            int mid = left + (right - left) / 2;
            int ct = count(matrix, mid, n);
            if (ct < k)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    private int count(int[][] m, int mid, int n) {
        int x = n, y = 0;
        int count = 0;
        while (x >= 0 && y <= n) {
            if (m[x][y] <= mid) {
                count += x + 1;
                y++;
            } else {
                x--;
            }
        }
        return count;
    }
}
