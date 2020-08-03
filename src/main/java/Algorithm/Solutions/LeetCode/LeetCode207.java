package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode207 {
    private List<List<Integer>> graph;
    private int[] status;
    private boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>();
        status = new int[numCourses];

        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : prerequisites)
            graph.get(edge[0]).add(edge[1]);

        for (int i = 0; i < numCourses && valid; i++) {
            if (status[i] == 0)
                dfs(i);
        }

        return valid;
    }

    private void dfs(int u) {
        status[u] = 1;
        for (int i = 0; i < graph.get(u).size(); i++) {
            if (status[graph.get(u).get(i)] == 0) {
                dfs(graph.get(u).get(i));
                if (!valid)
                    return;
            } else if (status[graph.get(u).get(i)] == 1) {
                valid = false;
                return;
            }
        }
        status[u] = 2;
    }
}
