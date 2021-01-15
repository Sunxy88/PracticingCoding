package Algorithm.Solutions.LeetCode;

public class LeetCode803 {

    private int m, n;
    private int[][] directions = new int[][] {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };

    public int[] hitBricks(int[][] grid, int[][] hits) {
        if (grid == null || hits == null) {
            return new int[0];
        }

        m = grid.length;
        n = grid[0].length;

        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = grid[i][j];
            }
        }

        for (int[] hit : hits) {
            copy[hit[0]][hit[1]] = 0;
        }

        int size = m * n;
        UnionFind unionFind = new UnionFind(size + 1);

        for (int i = 0; i < n; i++) {
            if (copy[0][i] == 1) {
                unionFind.union(size, i);
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (copy[i][j] == 1) {
                    if (copy[i - 1][j] == 1) {
                        unionFind.union(getIndex(i - 1, j), getIndex(i , j));
                    }
                    if (j > 0 && copy[i][j - 1] == 1) {
                        unionFind.union(getIndex(i, j - 1), getIndex(i, j));
                    }
                }
            }
        }

        int hitsLen = hits.length;
        int[] res = new int[hitsLen];

        for (int i = hitsLen - 1; i >= 0; i--) {
            int x = hits[i][0], y = hits[i][1];

            if (grid[x][y] == 0) {
                continue;
            }

            int original = unionFind.getSize(size);

            if (x == 0) {
                unionFind.union(y, size);
            }

            for (int[] direction : directions) {
                int newX = x + direction[0], newY = y + direction[1];
                if (inArea(newX, newY) && copy[newX][newY] == 1) {
                    unionFind.union(getIndex(x, y), getIndex(newX, newY));
                }
            }

            int current = unionFind.getSize(size);

            res[i] =  Math.max(0, current - original - 1);
            copy[x][y] = 1;
        }

        return res;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    private int getIndex(int x, int y) {
        return x * n + y;
    }

    private class UnionFind {
        private int[] parent;
        private int[] size;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        public void union(int x, int y) {
            int rootx = find(x);
            int rooty = find(y);

            if (rooty != rootx) {
                parent[rooty] = rootx;
                size[rootx] += size[rooty];
            }
        }

        public int getSize(int x) {
            int rootx = find(x);
            return size[rootx];
        }
    }

}
