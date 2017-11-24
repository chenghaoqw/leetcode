import java.util.ArrayList;
import java.util.List;

public class Q54SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> r=new ArrayList<Integer>();
        int h=matrix.length;
        if(h==0){
            return r;
        }
        int w=matrix[0].length;
        for(int i=0;i<(h+1)/2 && i<(w+1)/2;i++){
            for(int j=i;j<w-i;j++){
                r.add(matrix[i][j]);
            }
            for(int j=i+1;j<h-i;j++){
                r.add(matrix[j][w-i-1]);
            }
            for(int j=w-i-2;j>=i && i!=h-i-1 && i!=w-i-1;j--){
                r.add(matrix[h-i-1][j]);
            }
            for(int j=h-i-2;j>i && i!=h-i-1 && i!=w-i-1;j--){
                r.add(matrix[j][i]);
            }
        }
        return r;
    }
}
