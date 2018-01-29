import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int l=strs.length;
        List<List<String>> list=new ArrayList<>();
        HashMap<Character,Integer>[] maps=new HashMap[l];
        for(int i=0;i<l;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            o(map,strs[i]);
            maps[i]=map;
        }
        boolean[] use=new boolean[l];
        int start=0;
        while(start<l){
            HashMap<Character,Integer> i1map=new HashMap<>();
            List<String> t=new ArrayList<String>();
            for(int i=start;i<l;i++){
                String s=strs[i];
                if(use[i] || s.length()!=strs[start].length()) continue;
                if(i==start) i1map=maps[i];
                if(i1map.equals(maps[i])){
                    use[i]=true;
                    t.add(s);
                }
            }
            list.add(t);
            for(int i=0;i<l;i++){
                if(!use[i]){
                    start=i;
                    break;
                }else if(i>=l-1) start=l;
            }
        }
        return list;
    }

    private void o(HashMap<Character,Integer> map,String s){
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
    }
}
