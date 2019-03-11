public class Q807MaxIncreasetoKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l = grid.length;
        int[] row = new int[l];
        int[] col = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                ans += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return ans;
    }
}