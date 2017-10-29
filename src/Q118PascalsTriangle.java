import java.util.ArrayList;
import java.util.List;

public class Q118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(numRows==0){
            return result;
        }
        List<Integer> temp=new ArrayList<Integer>();
        temp.add(1);
        result.add(temp);
        for(int i=1;i<numRows;i++){
            List<Integer> sub=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                int subResult=0;
                if(j==0){
                    subResult+=result.get(i-1).get(0);
                }else if(j==i){
                    subResult+=result.get(i-1).get(i-1);
                }else{
                    subResult+=result.get(i-1).get(j-1);
                    subResult+=result.get(i-1).get(j);
                }
                sub.add(subResult);
            }
            result.add(sub);
        }
        return result;
    }
}
