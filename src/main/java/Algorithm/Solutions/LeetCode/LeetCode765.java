package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode765 {

    public int minSwapsCouples(int[] row) {
        int n;
        if (row == null || (n = row.length) == 0) {
            return 0;
        }
        int numCP = n / 2;
        UnionFind unionFind = new UnionFind(numCP);

        for (int i = 0; i < n; i += 2) {
            int l = row[i] / 2;
            int r = row[i + 1] / 2;
            unionFind.union(l, r);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numCP; i++) {
            int rooti = unionFind.find(i);
            map.put(rooti, map.getOrDefault(rooti, 0) + 1);
        }

        int res = 0;
        for (Integer value : map.values()) {
            res += value - 1;
        }

        return res;
    }


    private class UnionFind {
        private int[] parent;

        public UnionFind(int n ) {
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

            if (rootx != rooty) {
                parent[rootx] = rooty;
            }
        }
    }
}
