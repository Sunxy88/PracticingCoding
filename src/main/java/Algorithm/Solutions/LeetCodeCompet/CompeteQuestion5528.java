package Algorithm.Solutions.LeetCodeCompet;

import java.util.Arrays;

public class CompeteQuestion5528 {

    private int[][]  intensity = new int[101][101];
    private int radius;

    public int[] bestCoordinate(int[][] towers, int radius) {
        this.radius = radius;
        int[] res = new int[2];
        int curIsty = Integer.MIN_VALUE;
        int cnt = 0;
        for (int[] tower : towers) {
            cnt++;
            int minx = Math.max(0, tower[0] - radius), maxx = tower[0] + radius;
            int miny = Math.max(0, tower[1] - radius), maxy = tower[1] + radius;
//            int minx = 0, maxx = 100;
//            int miny = 0, maxy = 100;

            for (int x = minx; x <= maxx; x++) {
                for (int y = miny; y <= maxy; y++) {
                    intensity[x][y] += calcIntensity(tower, x, y);
                }
            }
        }


        for (int i = 0; i < intensity.length; i++) {
            for (int j = 0; j < intensity[i].length; j++) {
                if (curIsty < intensity[i][j]) {
                    res[0] = i;
                    res[1] = j;
                    curIsty = intensity[i][j];
                }
            }
        }

        return res;
    }

    private double calcDistance(int tx, int ty, int px, int py) {
        return Math.sqrt(Math.pow(tx - px, 2) + Math.pow(ty - py, 2));
    }

    private int calcIntensity(int[] tower, int px, int py) {
        double distance;
        if ((distance = calcDistance(tower[0], tower[1], px, py)) > radius) {
            return 0;
        }
        return (int)(tower[2] / (1 + distance));
    }

}
