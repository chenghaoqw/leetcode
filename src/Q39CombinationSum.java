import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q39CombinationSum
{
    private List<List<Integer>> r=new ArrayList<List<Integer>>();
    private HashMap<Integer,List<List<Integer>>> d=new HashMap<Integer,List<List<Integer>>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return ref(candidates,target,new ArrayList<>());
    }

    public List<List<Integer>> ref(int[] c,int t,List<Integer> list){
        List<List<Integer>> b=new ArrayList<List<Integer>>();
        if(t==0){
            b.add(list);
            return b;
        }
        if(d.containsKey(t)){
            b = d.get(t);
        }else{
            for(int i=c.length-1;i>=0;i--){
                if(c[i] <= t && (list.size()==0 || list.get(0) >= c[i])){
                    List<Integer> list1=new ArrayList<Integer>();
                    list1.addAll(list);
                    list1.add(0,c[i]);
                    List<List<Integer>> f=ref(c,t-c[i],list1);
                    b.addAll(f);
                    // d.put(t-c[i],b);
                }
            }
        }
        return b;
    }
}
