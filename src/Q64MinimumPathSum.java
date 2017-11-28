public class Q64MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int h=grid.length;
        if(h==0) return 0;
        int w=grid[0].length;
        if(w==0) return 0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(i==0 && j==0){
                    continue;
                }
                int min=-1;
                if(j!=0){
                    min=grid[i][j-1];
                }
                if(i!=0){
                    if(min>=0){
                        min=Math.min(grid[i-1][j],min);
                    }else{
                        min=grid[i-1][j];
                    }
                }
                grid[i][j]+=min;
            }
        }
        return grid[h-1][w-1];
    }
}
