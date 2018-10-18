public class Q892SurfaceAreaof3DShapes {
    public int surfaceArea(int[][] grid) {
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) ret += 2;
                int t = 0;
                if (j >= 1) t = grid[i][j - 1];
                else t = 0;
                if (grid[i][j] > t) ret += grid[i][j] - t;
                if (j < grid[i].length - 1) t = grid[i][j + 1];
                else t = 0;
                if (grid[i][j] > t) ret += grid[i][j] - t;
                if (i >= 1) t = grid[i - 1][j];
                else t = 0;
                if (grid[i][j] > t) ret += grid[i][j] - t;
                if (i < grid.length - 1) t = grid[i + 1][j];
                else t = 0;
                if (grid[i][j] > t) ret += grid[i][j] - t;
            }
        }
        return ret;
    }
}