public class Q529Minesweeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board == null || board.length <= 0) return board;
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }
        dfs(board, x, y);
        return board;
    }

    public void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'E') {
            return;
        }
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i < 0 || x + i >= board.length || y + j < 0 || y + j >= board[0].length) continue;
                if (board[x + i][y + j] == 'M' || board[x + i][y + j] == 'X') count++;
            }
        }
        if (count != 0) board[x][y] = (char) (count + '0');
        else {
            board[x][y] = 'B';
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    dfs(board, x + i, y + j);
                }
            }
        }
    }
}