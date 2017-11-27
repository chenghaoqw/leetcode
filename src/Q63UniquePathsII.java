public class Q63UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==0 || obstacleGrid[0].length==0 || obstacleGrid[0][0]==1){
            return 0;
        }
        obstacleGrid[0][0]=-1;
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[i].length;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                    continue;
                }
                int r=obstacleGrid[i][j];
                if(i!=0){
                    r+=obstacleGrid[i-1][j];
                }
                if(j!=0){
                    r+=obstacleGrid[i][j-1];
                }
                obstacleGrid[i][j]=r;
            }
        }
        return -obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
