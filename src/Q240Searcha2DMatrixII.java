public class Q240Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        if(row<1) return false;
        int clo=matrix[0].length;
        for(int i=0,j=clo-1;i<row && j>=0;){
            int index=matrix[i][j];
            if(target==index) return true;
            else if(target<index) j--;
            else i++;
        }
        return false;
    }
}
