public class Q695MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int h=grid.length;
        if(h < 1){
            return 0;
        }
        int w=grid[0].length;
        boolean[][] visit=new boolean[h][w];
        int r=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                r=Math.max(r,dfs(grid,visit,i,j,h,w));
            }
        }
        return r;
    }

    public int dfs(int[][]  grid,boolean[][] visit,int i,int j,int h, int w){
        if(i<0 || i>=h || j<0 || j>=w || visit[i][j] || grid[i][j]==0){
            return 0;
        }
        visit[i][j]=true;
        return 1+dfs(grid,visit,i-1,j,h,w)+dfs(grid,visit,i+1,j,h,w)+
                dfs(grid,visit,i,j-1,h,w)+dfs(grid,visit,i,j+1,h,w);
    }
}
