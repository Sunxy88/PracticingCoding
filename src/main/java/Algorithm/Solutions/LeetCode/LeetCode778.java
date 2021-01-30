package Algorithm.Solutions.LeetCode;

public class LeetCode778 {

    private int[][] directions = new int[][]{
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    public int swimInWater(int[][] grid) {
        int m, n;
        if (grid == null || (m = grid.length) == 0 || (n = grid[0].length) == 0) {
            return 0;
        }

        int len = m * n;

        int[] index = new int[len];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                index[grid[i][j]] = i * n + j;
            }
        }

        UnionFind unionFind = new UnionFind(m * n);
        for (int i = 0; i < len; i++) {
            int x = index[i] / n;
            int y = index[i] % n;
            for (int[] direction : directions) {
                int newx = x + direction[0], newy = y + direction[1];
                if (newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] <= i) {
                    unionFind.union(index[i], newx * n + newy);
                }

                if (unionFind.connected(0, len - 1)) {
                    return i;
                }
            }
        }

        return -1;
    }

    private class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                this.parent[i] = i;
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
            if (rootx != rooty) {
                parent[rootx] = rooty;
            }
        }

        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
