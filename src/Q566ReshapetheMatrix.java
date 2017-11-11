public class Q566ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int h=nums.length;
        if(h==0){
            return nums;
        }
        int w=nums[0].length;
        if(w * h != r*c){
            return nums;
        }
        int[][] u=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int t=i*c+j;
                u[i][j]=nums[t/w][t%w];
            }
        }
        return u;
    }
}
