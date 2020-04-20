package Algorithm.Solutions.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode200 {
    class UnionFind {
        private int[] parent;
        private int[] rank;
        private int count;

        public UnionFind(char[][] grid) {
            int rc = grid.length;
            int lc = grid[0].length;
            parent = new int[rc * lc];
            rank = new int[rc * lc];
            count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        parent[i * lc + j] = i * lc + j;
                        count++;
                    }
                    rank[i * lc + j] = 0;
                }
            }
        }

        public int find(int id) {
            while (parent[id] != id)
                id = parent[id];
            return id;
        }

        public void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if (px == py) return ;

            if (rank[px] < rank[py]) {
                parent[py] = px;
            }
            else if (rank[px] > rank[py]) {
                parent[px] = py;
            }
            else {
                parent[px] = py;
                rank[py]++;
            }
            count--;
        }

        public int getCount() {
            return count;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null)
            return 0;


        int nr = grid.length;
        int nc = grid[0].length;

        UnionFind uf = new UnionFind(grid);
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '0';
                    if (r - 1 >= 0 && grid[r-1][c] == '1') {
                        uf.union(r * nc + c, (r-1) * nc + c);
                    }
                    if (r + 1 < nr && grid[r+1][c] == '1') {
                        uf.union(r * nc + c, (r+1) * nc + c);
                    }
                    if (c - 1 >= 0 && grid[r][c-1] == '1') {
                        uf.union(r * nc + c, r * nc + c - 1);
                    }
                    if (c + 1 < nc && grid[r][c+1] == '1') {
                        uf.union(r * nc + c, r * nc + c + 1);
                    }
                }
            }
        }

        return uf.getCount();
    }
}
