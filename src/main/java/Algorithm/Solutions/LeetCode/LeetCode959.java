package Algorithm.Solutions.LeetCode;

public class LeetCode959 {

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size =  4 * n * n;

        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < n; i++) {
            char[] row = grid[i].toCharArray();
            for (int j = 0; j < n; j++) {
                int index = 4 * (i * n + j);
                char c = row[j];
                if (c == '/') {
                    unionFind.union(index, index + 3);
                    unionFind.union(index + 1, index + 2);
                } else if (c == '\\') {
                    unionFind.union(index, index + 1);
                    unionFind.union(index + 2, index + 3);
                } else {
                    unionFind.union(index, index + 1);
                    unionFind.union(index + 1, index + 2);
                    unionFind.union(index + 2, index + 3);
                }
                if (j + 1 < n) {
                    unionFind.union(index + 1, 4 * (i * n + j + 1) + 3);
                }
                if (i + 1 < n) {
                    unionFind.union(index + 2, 4 * ((i + 1) * n + j));
                }
            }
        }

        return unionFind.getSetCount();
    }

    private class UnionFind {
        private int[] parent;
        private int setCount;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                this.parent[i] = i;
            }
            this.setCount = n;
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int y, int x) {
            int rooty = find(y), rootx = find(x);
            if (rootx != rooty) {
                parent[rootx] = rooty;
                setCount--;
            }
        }

        public int getSetCount() {
            return setCount;
        }
    }

}
