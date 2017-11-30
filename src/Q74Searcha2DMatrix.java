public class Q74Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int t=search(matrix,target,i);
            if(t!=-1){
                return true;
            }
        }
        return false;
    }

    public int search(int[][] matrix,int target,int r){
        int b=0,e=matrix[r].length;
        int m=(b+e)/2;
        while(e>=b){
            if(m>=matrix[r].length || m<0){
                return -1;
            }
            if(matrix[r][m] > target) e=m-1;
            else if(matrix[r][m] < target) b=m+1;
            else return m;
            m=(b+e)/2;
        }
        return -1;
    }
}
