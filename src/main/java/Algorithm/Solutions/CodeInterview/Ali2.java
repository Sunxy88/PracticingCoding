package Algorithm.Solutions.CodeInterview;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Ali2 {

    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int n = routes.length;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Arrays.sort(routes[i]);
            graph.add(new ArrayList<>());
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> targets = new HashSet<>();
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intersect(routes[i], routes[j])) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(routes[i], source) >= 0) {
                seen.add(i);
                q.offer(new Point(i, 0));
            }
            if (Arrays.binarySearch(routes[i], target) >= 0) {
                targets.add(i);
            }
        }

        while (!q.isEmpty()) {
            Point info = q.poll();
            int node = info.x, depth = info.y;
            if (targets.contains(node)) {
                return depth + 1;
            }
            for (Integer intersectedRoutes : graph.get(node)) {
                if (!seen.contains(intersectedRoutes)) {
                    seen.add(intersectedRoutes);
                    q.offer(new Point(intersectedRoutes, depth + 1));
                }
            }
        }

        return -1;
    }

    private boolean intersect(int[] r1, int[] r2) {
        for (int i = 0, j = 0; i < r1.length && j < r2.length; ) {
            if (r1[i] == r2[j]) {
                return true;
            }
            if (r1[i] < r2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return false;
    }
}
