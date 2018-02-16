import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q739DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] r=new int[temperatures.length];
        HashMap<Integer,List<Integer>> map=new HashMap();
        for(int i=0;i<temperatures.length;i++){
            if(map.containsKey(temperatures[i])) map.get(temperatures[i]).add(i);
            else {
                List<Integer> list=new ArrayList();
                list.add(i);
                map.put(temperatures[i],list);
            }
            for(int j:map.keySet()){
                if(temperatures[i]>j){
                    List<Integer> list=map.get(j);
                    if(list!=null){
                        for(int k=0;k<list.size();k++){
                            r[list.get(k)]=i-list.get(k);
                        }
                        map.put(j,new ArrayList());
                    }
                }
            }

        }
        return r;
    }
}
