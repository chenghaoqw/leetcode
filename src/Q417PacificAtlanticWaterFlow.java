import java.util.ArrayList;
import java.util.List;

public class Q417PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> list = new ArrayList();
        int r = matrix.length;
        if (r <= 0) return list;
        int c = matrix[0].length;
        boolean[][] p = new boolean[r][c];
        boolean[][] a = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            dfs(matrix, p, Integer.MIN_VALUE, i, 0);
            dfs(matrix, a, Integer.MIN_VALUE, i, matrix[0].length - 1);
        }
        for (int i = 0; i < c; i++) {
            dfs(matrix, p, Integer.MIN_VALUE, 0, i);
            dfs(matrix, a, Integer.MIN_VALUE, matrix.length - 1, i);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (p[i][j] && a[i][j]) list.add(new int[]{i, j});
            }
        }
        return list;
    }

    public void dfs(int[][] matrix, boolean[][] visisted, int pre, int r, int c) {
        if (r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length || visisted[r][c] || matrix[r][c] < pre)
            return;
        visisted[r][c] = true;
        dfs(matrix, visisted, matrix[r][c], r + 1, c);
        dfs(matrix, visisted, matrix[r][c], r - 1, c);
        dfs(matrix, visisted, matrix[r][c], r, c + 1);
        dfs(matrix, visisted, matrix[r][c], r, c - 1);
    }
}
