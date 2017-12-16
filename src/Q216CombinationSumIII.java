import java.util.ArrayList;
import java.util.List;

public class Q216CombinationSumIII {
    private List<List<Integer>> r=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        ref(k,n,1,new ArrayList<Integer>());
        return r;
    }

    public void ref(int k,int n,int last,List<Integer> list1){
        if(k<=0) return;
        k--;
        for(int i=last;i<=9;i++){
            List<Integer> list=new ArrayList<Integer>();
            list.addAll(list1);
            list.add(i);
            if(n==i &&k==0) r.add(list);
            else if(i<=(n-1)/2) ref(k,n-i,i+1,list);
        }
    }
}
