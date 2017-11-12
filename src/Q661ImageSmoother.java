public class Q661ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int h=M.length;
        if(h<1){
            return M;
        }
        int w=M[0].length;
        int[][] r=new int[h+2][w+2];
        for(int i=0;i<h+2;i++){
            for(int j=0;j<w+2;j++){
                if(i==0||i==h+1 || j==0 || j==w+1)
                    r[i][j]=-1;
            }
        }
        for(int i=1;i<h+1;i++){
            for(int j=1;j<w+1;j++){
                r[i][j]=M[i-1][j-1];
            }
        }
        int[][] r2=new int[h][w];
        for(int i=1;i<h+1;i++){
            for(int j=1;j<w+1;j++){
                int count=0;
                double sum=0d;
                for(int z=-1;z<2;z++){
                    for(int x=-1;x<2;x++){
                        if(r[i+z][j+x]!=-1){
                            count++;
                            sum+=r[i+z][j+x];
                        }
                    }
                }
                double result=Math.floor(sum/count);
                r2[i-1][j-1]=(int)result;
            }
        }
        return r2;
    }
}
