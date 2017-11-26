public class Q62UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] r=new int[m+1][n+1];
        r[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j==1){
                    continue;
                }
                r[j][i]=r[j-1][i] + r[j][i-1];
            }
        }
        return r[m][n];
    }
}
