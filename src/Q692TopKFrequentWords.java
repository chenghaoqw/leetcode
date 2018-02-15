import java.util.*;

public class Q692TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])) map.put(words[i],map.get(words[i])+1);
            else map.put(words[i],1);
        }
        List<Map.Entry<String,Integer>> l=new ArrayList(map.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                if(o1.getValue() != o2.getValue()) return o2.getValue().compareTo(o1.getValue());
                for(int i=0;i<o1.getKey().length() && i<o2.getKey().length();i++){
                    if(o1.getKey().charAt(i) >o2.getKey().charAt(i)) return 1;
                    else if(o1.getKey().charAt(i) <o2.getKey().charAt(i)) return -1;
                }
                return o1.getKey().length()-o2.getKey().length();
            }
        });
        int count=0;
        List<String> list=new ArrayList<String>();
        for(Map.Entry<String,Integer> m:l){
            list.add(m.getKey());
            count++;
            if(count==k) return list;
        }
        return list;
    }
}
