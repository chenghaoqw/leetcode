public class Q200NumberofIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        boolean is = true;
        int count = 0;
        int[][] mark = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        if (grid[i][j] == '1') grid[i][j] = '0';
        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
    }
}