package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1631 {

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        UnionFind unionFind = new UnionFind(m * n);
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int id = i * n + j;
                if (i > 0) {
                    edges.add(new int[] {id - n, id, Math.abs(heights[i][j] - heights[i - 1][j])});
                }
                if (j > 0) {
                    edges.add(new int[] {id - 1, id, Math.abs(heights[i][j] - heights[i][j - 1])});
                }
            }
        }

        Collections.sort(edges, (o1, o2) -> o1[2] - o2[2]);

        int ans = 0;
        for (int[] edge : edges) {
            int p1 = edge[0], p2 = edge[1], w = edge[2];
            unionFind.union(p1, p2);
            if (unionFind.connected(0, m * n - 1)) {
                ans = w;
                break;
            }
        }

        return ans;
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
            int rootx = find(x), rooty = find(y);
            if (rootx != rooty) {
                parent[rootx] = rooty;
            }
        }

        public boolean connected(int x, int y) {
            int rootx = find(x), rooty = find(y);
            return rootx == rooty;
        }
    }
}
