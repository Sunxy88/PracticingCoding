package Algorithm.Solutions.LeetCode;

public class LeetCode547 {

    public int findCircleNum(int[][] isConnected) {
        int numVertex = isConnected.length;
        boolean[] visited = new boolean[numVertex];
        int numProv = 0;

        for (int i = 0; i < numVertex; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                numProv++;
            }
        }

        return numProv;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }

}
