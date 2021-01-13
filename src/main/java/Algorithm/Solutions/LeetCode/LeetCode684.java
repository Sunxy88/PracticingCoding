package Algorithm.Solutions.LeetCode;

public class LeetCode684 {

    public int[] findRedundantConnection(int[][] edges) {
        int n;
        if (edges == null || (n = edges.length) == 0) {
            return new int[0];
        }

        UnionFind unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            int rootx = unionFind.find(edge[0]);
            int rooty = unionFind.find(edge[1]);
            if (rooty == rootx) {
                return edge;
            } else {
                unionFind.union(edge[0], edge[1]);
            }
        }

        return new int[0];
    }

    private class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            this.parent = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
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

            if (rooty != rootx) {
                parent[rootx] = rooty;
            }
        }
    }
}
