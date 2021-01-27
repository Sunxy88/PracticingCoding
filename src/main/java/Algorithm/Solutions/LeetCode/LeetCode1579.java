package Algorithm.Solutions.LeetCode;

public class LeetCode1579 {

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind ufa = new UnionFind(n);
        UnionFind ufb = new UnionFind(n);
        int ans = 0;

        for (int[] edge : edges) {
            --edge[1];
            --edge[2];
        }

        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!ufa.union(edge[1], edge[2])) {
                    ++ans;
                } else {
                    ufb.union(edge[1], edge[2]);
                }
            }
        }

        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!ufa.union(edge[1], edge[2])) {
                    ++ans;
                }
            } else if (edge[0] == 2) {
                if (!ufb.union(edge[1], edge[2])) {
                    ++ans;
                }
            }
        }

        if (ufa.setCount != 1 || ufb.setCount != 1) {
            return -1;
        }
        return ans;
    }

    private class UnionFind {
        private int parent[];
        private int setCount;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.setCount = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootx = find(x), rooty = find(y);
            if (rootx != rooty) {
                parent[rootx] = rooty;
                setCount--;
                return true;
            }
            return false;
        }
    }
}
