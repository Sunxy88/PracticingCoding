package Algorithm.Solutions.LeetCode;

public class LeetCode839 {

    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++ ){
            for (int j = i + 1; j < n; j++) {
                if (!unionFind.connected(i, j) && check(strs[i], strs[j], m)) {
                    unionFind.union(i, j);
                }
            }
        }

        return unionFind.getSetCount();
    }

    private boolean check(String stra, String strb, int len) {
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (stra.charAt(i) != strb.charAt(i)) {
                cnt++;
                if (cnt > 2) {
                    return false;
                }
            }
        }

        return true;
    }

    private class UnionFind {
        private int[] parent;
        private int setCount;

        public UnionFind(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            this.setCount = n;
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
                setCount--;
            }
        }

        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }

        public int getSetCount() {
            return setCount;
        }
    }
}
