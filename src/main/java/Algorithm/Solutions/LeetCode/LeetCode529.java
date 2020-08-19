package Algorithm.Solutions.LeetCode;

public class LeetCode529 {
    private int m, n;
    private int[][] surs = new int[][] {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1},
            {1, 1},
            {-1, 1},
            {1, -1},
            {-1, -1}
    };

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board == null || click == null)
            return null;
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        m = board.length;
        n = board[0].length;
        return updateBoardHelper(board, click);
    }

    private char[][] updateBoardHelper(char[][] board, int[] click) {
        if (click[0] < 0 || click[0] >= m || click[1] < 0 || click[1] >= n)
            return board;
        char t = getElement(board, click);
        if (t != 'E')
            return board;
        int cnt = countMines(board, click);
        if (cnt != 0) {
            board[click[0]][click[1]] = (char)('0' + cnt);
            return board;
        }
        board[click[0]][click[1]] = 'B';
        for (int[] dir : surs) {
            updateBoardHelper(board, new int[] {click[0] + dir[0], click[1] + dir[1]});
        }
        return board;
    }

    private char getElement(char[][] board, int[] click) {
        return board[click[0]][click[1]];
    }

    private int countMines(char[][] board, int[] click) {
        int cnt = 0;
        for (int[] sur : surs) {
            int x = click[0] + sur[0], y = click[1] + sur[1];
            if (x >= 0 && x < m && y >= 0 && y <n) {
                if (board[x][y] == 'M')
                    cnt++;
            }
        }
        return cnt;
    }
}
