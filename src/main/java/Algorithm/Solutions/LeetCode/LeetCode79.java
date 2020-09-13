package Algorithm.Solutions.LeetCode;

public class LeetCode79 {
    public boolean exist(char[][] board, String word) {
        if (board == null || word == null || board.length == 0)
            return false;

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                visited[i][j] = false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, word, visited, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] visited,int x, int y, int indexInWord) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[x].length || visited[x][y])
            return false;

        if (indexInWord == word.length() - 1)
            return board[x][y] == word.charAt(indexInWord);

        if (board[x][y] != word.charAt(indexInWord))
            return false;

        visited[x][y] = true;

        if (dfs(board, word, visited, x + 1, y, indexInWord + 1)) return true;
        if (dfs(board, word, visited, x, y + 1, indexInWord + 1)) return true;
        if (dfs(board, word, visited, x - 1, y, indexInWord + 1)) return true;
        if (dfs(board, word, visited, x, y - 1, indexInWord + 1)) return true;

        visited[x][y] = false;

        return false;
    }
}
