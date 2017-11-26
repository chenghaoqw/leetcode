public class Q59SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] r=new int[n][n];
        int w=1;
        for(int i=0;i< (n+1)/2;i++){
            if(i==n-i-1){
                r[i][i]=w;
                break;
            }
            for(int j=i;j<n-i-1;j++){
                r[i][j]=w;
                w++;
            }
            for(int j=i;j<n-i-1;j++){
                r[j][n-i-1]=w;
                w++;
            }
            for(int j=n-i-1;j>i;j--){
                r[n-i-1][j]=w;
                w++;
            }
            for(int j=n-i-1;j>i;j--){
                r[j][i]=w;
                w++;
            }
        }
        return r;
    }
}
