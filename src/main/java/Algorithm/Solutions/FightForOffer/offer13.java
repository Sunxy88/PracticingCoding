package Algorithm.Solutions.FightForOffer;

public class offer13 {

    private boolean[][] visited;
    private int cnt = 0;
    private int m, n, k;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];
        return dfs(0, 0);
    }

    private int dfs(int x, int y) {
        if (x >= m || y >= n || visited[x][y] || digitSum(x) + digitSum(y) > k) return 0;
        visited[x][y] = true;
        return 1 + dfs(x + 1, y) + dfs(x, y + 1);
    }

    private int digitSum(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
