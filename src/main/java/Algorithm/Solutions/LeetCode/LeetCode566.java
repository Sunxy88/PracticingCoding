package Algorithm.Solutions.LeetCode;

public class LeetCode566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) {
            return nums;
        }
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] res = new int[r][c];
        int ptr_r = 0, ptr_c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[ptr_r][ptr_c] = nums[i][j];
                ptr_c++;
                if (ptr_c == c) {
                    ptr_c = 0;
                    ptr_r++;
                }
            }
        }

        return res;
    }

}
