package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null) {
            return res;
        }

        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    res.add(matrix[bottom][i]);
                }
                for (int i = bottom; i > top ; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return res;
    }

}
