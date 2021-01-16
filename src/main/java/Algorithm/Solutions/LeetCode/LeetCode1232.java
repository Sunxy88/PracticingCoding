package Algorithm.Solutions.LeetCode;

public class LeetCode1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int len;
        if (coordinates == null || (len = coordinates.length) <= 1) {
            return false;
        }
        
        double k = getGradient(coordinates[0], coordinates[1]);

        for (int i = 2; i < len; i++) {
            if (k != getGradient(coordinates[0], coordinates[i])) {
                return false;
            }
        }

        return true;
    }

    private double getGradient(int[] p1, int[] p2) {
        if (p2[1] == p1[1]) {
            return Integer.MAX_VALUE;
        }

        return (0.0 + p2[1] - p1[1]) / (0.0 + p2[0] - p1[0]);
    }

}
