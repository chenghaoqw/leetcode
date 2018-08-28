import java.util.LinkedList;
import java.util.Queue;

public class Q130SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        int[][] a = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1) {
                    bfs(board, i, j, a);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '$') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void bfs(char[][] board, int i, int j, int[][] a) {
        if (a[i][j] == 1 || board[i][j] == 'X') {
            return;
        }
        board[i][j] = '$';
        a[i][j] = 1;
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] tt = queue.poll();
            i = tt[0];
            j = tt[1];
            for (int index = 0; index < 4; index++) {
                int i1 = i;
                int j1 = j;
                if (index == 0) {
                    i1++;
                } else if (index == 1) {
                    j1++;
                } else if (index == 2) {
                    i1--;
                } else {
                    j1--;
                }
                if (i1 >= board.length || i1 < 0 || j1 < 0 || j1 >= board[0].length || a[i1][j1] == 1 || board[i1][j1] == 'X') {
                    continue;
                }
                queue.add(new int[]{i1, j1});
                a[i1][j1] = 1;
                board[i1][j1] = '$';
            }
        }
    }
}