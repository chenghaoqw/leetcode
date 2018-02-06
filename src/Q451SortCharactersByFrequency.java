import java.util.*;

public class Q451SortCharactersByFrequency {
    public String frequencySort(String s) {
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap();
        for(char c:chars){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        StringBuffer r=new StringBuffer("");
        for(Map.Entry<Character,Integer> m:list){
            for(int i=0;i<m.getValue();i++){
                r.append(m.getKey());
            }
        }
        return r.toString();
    }
}
