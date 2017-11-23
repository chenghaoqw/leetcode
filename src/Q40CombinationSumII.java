import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<candidates.length;i++){
            l.add(candidates[i]);
        }
        return ref(target,l,l.get(l.size()-1));
    }

    public List<List<Integer>> ref(int y,List<Integer> l,int s){
        List<List<Integer>> b=new ArrayList<List<Integer>>();
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i) > y || l.get(i) > s || (i<l.size()-1 && l.get(i)==l.get(i+1))){
                continue;
            }else if(l.get(i)==y){
                List<Integer> d=new ArrayList<Integer>();
                d.add(y);
                b.add(d);
            }else{
                List<Integer> l1=new ArrayList<>();
                l1.addAll(l);
                l1.remove(i);
                List<List<Integer>> f=ref(y-l.get(i),l1,l.get(i));
                for(int j=0;j<f.size();j++){
                    f.get(j).add(l.get(i));
                }
                b.addAll(f);
            }
        }
        return b;
    }
}
