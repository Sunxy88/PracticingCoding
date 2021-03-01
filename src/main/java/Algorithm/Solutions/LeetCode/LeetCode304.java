package Algorithm.Solutions.LeetCode;

public class LeetCode304 {
}


class NumMatrix {

    private int[][] data;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        data = new int[matrix.length][matrix[0].length];

        data[0][0] = matrix[0][0];
        for (int i = 1; i < data.length; i++) {
            data[i][0] = data[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < data[0].length; i++) {
            data[0][i] = data[0][i - 1] + matrix[0][i];
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                data[i][j] = matrix[i][j] + data[i - 1][j] + data[i][j - 1] - data[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0) {
            return data[row2][col2];
        }

        if (row1 == 0) {
            return data[row2][col2] - data[row2][col1 - 1];
        }

        if (col1 == 0) {
            return data[row2][col2] - data[row1 - 1][col2];
        }

        return data[row2][col2] - data[row1 - 1][col2] - data[row2][col1 - 1] + data[row1 - 1][col1 - 1];
    }
}