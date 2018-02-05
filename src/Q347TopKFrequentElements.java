import java.util.*;

public class Q347TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i:nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        List<Integer> list=new ArrayList();
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int count=0;
        for(Map.Entry<Integer,Integer> m:l){
            list.add(m.getKey());
            count++;
            if(count==k){
                return list;
            }
        }
        return list;
    }
}
