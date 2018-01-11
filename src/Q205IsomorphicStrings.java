import java.util.ArrayList;
import java.util.HashMap;

public class Q205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<ArrayList<Integer>> data=sub(s);
        ArrayList<Character> single=new ArrayList<Character>();
        for(ArrayList<Integer> tree:data){
            char temp=t.charAt(tree.get(0));
            if(tree.size()>1){
                for(int i=1;i<tree.size();i++){
                    if(t.charAt(tree.get(i))!=temp) return false;
                }
            }
            if(single.contains(temp)) return false;
            single.add(temp);
        }
        return true;
    }

    public ArrayList<ArrayList<Integer>> sub(String s){
        HashMap<Character,ArrayList<Integer>> data=new HashMap<Character,ArrayList<Integer>>();
        for(int i=0;i<s.length();i++){
            char j=s.charAt(i);
            if(data.containsKey(j)){
                data.get(j).add(i);
            }else{
                ArrayList<Integer> t=new ArrayList<Integer>();
                t.add(i);
                data.put(j,t);
            }
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        for(Character c:data.keySet()){
            result.add(data.get(c));
        }
        return result;
    }
}
