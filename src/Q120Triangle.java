import java.util.List;

public class Q120Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result=Integer.MAX_VALUE;
        if(triangle.size()==1) return triangle.get(0).get(0);
        for(int i=1;i<triangle.size();i++){
            List<Integer> t0=triangle.get(i-1);
            List<Integer> t=triangle.get(i);
            for(int j=0;j<t.size();j++){
                if(j==0) t.set(0,t0.get(0)+t.get(0));
                else if(j==t.size()-1) t.set(t.size()-1,t0.get(t.size()-2)+t.get(t.size()-1));
                else t.set(j,t.get(j)+Math.min(t0.get(j),t0.get(j-1)));
                if(i==triangle.size()-1){
                    result=Math.min(result,t.get(j));
                }
            }
        }
        return result;
    }
}
