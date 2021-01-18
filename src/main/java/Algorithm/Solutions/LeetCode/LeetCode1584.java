package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeetCode1584 {

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        UnionFind unionFind = new UnionFind(n);
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new Edge(distance(points, i, j), i, j));
            }
        }

        Collections.sort(edges, (o1, o2) -> o1.len - o2.len);

        int ret = 0, num = 1;
        for (Edge edge : edges) {
            int len = edge.len, x = edge.x, y = edge.y;
            if (unionFind.union(x, y)) {
                ret += len;
                num++;
                if (num == n) {
                    break;
                }
            }
        }

        return ret;
    }

    private int distance(int[][] points, int x, int y) {
        return Math.abs(points[x][0] - points[y][0]) + Math.abs(points[x][1] - points[y][1]);
    }

    private class  UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootx = find(x), rooty = find(y);

            if (rootx != rooty) {
                parent[rootx] = rooty;
                return true;
            }

            return false;
        }
    }

    private class Edge {
        int len, x, y;

        public Edge(int len, int x, int y) {
            this.len = len;
            this.x = x;
            this.y = y;
        }
    }
}
