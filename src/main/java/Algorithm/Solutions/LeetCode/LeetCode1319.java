package Algorithm.Solutions.LeetCode;

public class LeetCode1319 {

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        UnionFind unionFind = new UnionFind(n);
        for (int[] connection : connections) {
            unionFind.union(connection[0], connection[1]);
        }

        return unionFind.getSetCount() - 1;
    }

    private class UnionFind {
        private int[] parent;
        private int setCount;

        public UnionFind(int n) {
            this.setCount = n;
            this.parent = new int[n];

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

        public void union(int x, int y) {
            int rootx = find(x), rooty = find(y);
            if (rootx == rooty) {
                return;
            }
            parent[rootx] = rooty;
            setCount--;
        }

        public int getSetCount() {
            return setCount;
        }
    }
}
