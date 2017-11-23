public class Q48RotateImage {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<l/2;i++){
            for(int j=i;j<l-i-1;j++){
                int t1=matrix[i][j];
                matrix[i][j]=matrix[l-j-1][i];
                int t2=matrix[l-i-1][l-j-1];
                matrix[l-i-1][l-j-1]=matrix[j][l-i-1];
                matrix[j][l-i-1]=t1;
                matrix[l-j-1][i]=t2;;
            }
        }
    }
}
