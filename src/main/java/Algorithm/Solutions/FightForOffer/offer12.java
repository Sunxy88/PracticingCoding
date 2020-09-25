package Algorithm.Solutions.FightForOffer;

import java.util.Arrays;

public class offer12 {

    private char[][] board;
    private String word;

    public boolean exist(char[][] board, String word) {
        if (word == null)
            return true;
        if (board == null || board.length == 0)
            return false;
        this.board = board;
        this.word = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (helper(i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean helper(int x, int y, int index) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(index))
            return false;
        if (index == word.length() - 1) return true;
        char tmp = board[x][y];
        board[x][y] = '/';
        boolean flag = helper(x - 1, y, index + 1) || helper(x + 1, y, index + 1)
                        || helper(x, y - 1, index + 1) || helper(x, y + 1, index + 1);
        board[x][y] = tmp;
        return flag;
    }
}
