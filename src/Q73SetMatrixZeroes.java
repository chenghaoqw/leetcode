public class Q73SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int h=matrix.length;
        int w=matrix[0].length;
        boolean[][] is=new boolean[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(matrix[i][j]==0){
                    for(int e=0;e<w;e++) is[i][e]=true;
                    for(int e=0;e<h;e++) is[e][j]=true;
                }
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(is[i][j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
