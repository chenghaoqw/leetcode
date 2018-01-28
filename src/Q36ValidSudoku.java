import java.util.HashMap;

public class Q36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int colum = board[0].length;
        for (int i = 0; i < row; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < colum; j++) {
                int t = board[i][j];
                if (map.containsKey(t)) return false;
                else if ('1' <= t && t <= '9') map.put(t, 1);
            }
        }
        for (int i = 0; i < colum; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < row; j++) {
                int t = board[j][i];
                if (map.containsKey(t)) return false;
                else if ('1' <= t && t <= '9') map.put(t, 1);
            }
        }
        for (int i = 0; i < row; i += 3) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < colum; j += 3) {
                if (!isValid(board, i, j)) return false;
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int colum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int t = board[row + i][colum + j];
                if (map.containsKey(t)) return false;
                else if ('1' <= t && t <= '9') map.put(t, 1);
            }
        }
        return true;
    }
}
