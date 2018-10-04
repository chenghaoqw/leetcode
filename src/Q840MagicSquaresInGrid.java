public class Q840MagicSquaresInGrid {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {
                if (grid[i][j] == 5 && isValid(grid, i, j)) count++;
            }
        }
        return count;
    }

    public boolean isValid(int[][] grid, int r, int c) {
        int[] count = new int[16];
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (grid[i + r][c + j] > 9) return false;
                if (count[grid[i + r][c + j]] == 1) return false;
                else count[grid[i + r][c + j]] = 1;
            }
        }
        return grid[r][c - 1] + grid[r][c] + grid[r][c + 1] == 15
                && grid[r + 1][c - 1] + grid[r + 1][c] + grid[r + 1][c + 1] == 15
                && grid[r - 1][c - 1] + grid[r - 1][c] + grid[r - 1][c + 1] == 15
                && grid[r - 1][c - 1] + grid[r][c - 1] + grid[r + 1][c - 1] == 15
                && grid[r - 1][c] + grid[r][c] + grid[r + 1][c] == 15
                && grid[r - 1][c + 1] + grid[r][c + 1] + grid[r + 1][c + 1] == 15
                && grid[r - 1][c - 1] + grid[r][c] + grid[r + 1][c + 1] == 15;

    }
}