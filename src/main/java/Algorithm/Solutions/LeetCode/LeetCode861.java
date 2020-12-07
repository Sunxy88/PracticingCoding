package Algorithm.Solutions.LeetCode;

public class LeetCode861 {

    public int matrixScore(int[][] A) {
        int lines = A.length, columns = A[0].length;

        for (int i = 0; i < lines; i++) {
            if (A[i][0] != 1) {
                for (int j = 0; j < columns; j++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }

        for (int j = 1; j < columns; j++) {
            int count1 = 0;
            for (int i = 0; i < lines; i++) {
                if (A[i][j] == 1) {
                    count1++;
                }
            }
            if (count1 < lines / 2.0) {
                for (int i = 0; i < lines; i++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                sum += A[i][j] << (columns - j - 1);
            }
        }

        return sum;
    }

}
