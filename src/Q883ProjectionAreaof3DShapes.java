public class Q883ProjectionAreaof3DShapes {
    public int projectionArea(int[][] grid) {
        int ret = 0;
        int col = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[i][j]);
                if (grid[i][j] > 0) ret++;
            }
            ret += max;
            col = Math.max(col, grid[i].length);
        }
        for (int j = 0; j < col; j++) {
            int max = 0;
            for (int i = 0; i < grid.length && grid[i].length > j; i++) {
                max = Math.max(max, grid[i][j]);
            }
            ret += max;
        }
        return ret;
    }
}