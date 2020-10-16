package Algorithm.Solutions.LeetCode;

public class LeetCode52 {

    private int res = 0;

    public int totalNQueens(int n) {
        if (n == 0) {
            return 0;
        }

        boolean[][] board = new boolean[n][n];

        dfs(board, 0);

        return res;
    }

    private void dfs(boolean[][] board, int x) {
        if (x == board.length) {
            res++;
            return ;
        }

        for (int i = 0; i < board[x].length; i++) {
            if (goodOrNot(board, x, i)) {
                board[x][i] = true;
                dfs(board, x + 1);
                board[x][i] = false;
            }
        }
    }

    private boolean goodOrNot(boolean[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[x].length) {
            return false;
        }


        for (int i = 0; i < board.length; i++) {
            if (i == x) {
                continue;
            }
            if (board[i][y]) {
                return false;
            }
        }

        for (int i = 0; i < board[x].length; i++) {
            if (i == y) {
                continue;
            }
            if (board[x][i]) {
                return false;
            }
        }

        int diagonal1 = x + y, diagonal2 = x - y;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[x].length; j++) {
                if (i + j == diagonal1 || i - j  == diagonal2) {
                    if (board[i][j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
