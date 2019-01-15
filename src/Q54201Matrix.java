import java.util.LinkedList;

public class Q54201Matrix {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix.length <= 0 || matrix[0].length <= 0) return matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = bfs(matrix, i, j);
                }
            }
        }
        return matrix;
    }

    public int bfs(int[][] matrix, int i, int j) {
        boolean[][] v = new boolean[matrix.length][matrix[0].length];
        LinkedList<int[]> list = new LinkedList();
        list.add(new int[]{i, j});
        list.add(new int[]{-1, -1});
        int ret = 0;
        int dir[][] = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!list.isEmpty()) {
            int[] p = list.pop();
            if (p[0] == -1 && p[1] == -1) {
                ret++;
                list.add(new int[]{-1, -1});
                continue;
            }
            if (matrix[p[0]][p[1]] == 0) {
                return ret;
            }
            for (int k = 0; k < 4; k++) {
                int i1 = dir[k][0] + p[0];
                int j1 = dir[k][1] + p[1];
                if (i1 >= 0 && i1 < matrix.length && j1 >= 0 && j1 < matrix[0].length && !v[i1][j1]) {
                    list.add(new int[]{i1, j1});
                    v[i1][j1] = true;
                }
            }
        }
        return 0;
    }
}