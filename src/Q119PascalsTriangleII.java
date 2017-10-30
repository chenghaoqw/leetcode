import java.util.ArrayList;
import java.util.List;

public class Q119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer>();
        result.add(1);
        for(int i=1;i<=rowIndex;i++){
            int temp=1;
            for(int j=1;j<i/2+1;j++){
                int subTemp=result.get(j);
                result.set(j,temp+result.get(j));
                temp=subTemp;
            }
            for(int j=i/2+1;j<=i;j++){
                if(i==j){
                    result.add(j,result.get(i-j));
                }else{
                    result.set(j,result.get(i-j));
                }
            }
        }
        return result;
    }
}
