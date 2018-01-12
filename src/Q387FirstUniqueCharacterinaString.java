import java.util.HashMap;

public class Q387FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int r=Integer.MAX_VALUE;
        HashMap<Character,Integer> data=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(!data.containsKey(t)) data.put(t,i);
            else data.put(t,-1);
        }
        for(Character i:data.keySet()){
            if(data.get(i)>=0) r=Math.min(r,data.get(i));
        }
        if(r==Integer.MAX_VALUE) return -1;
        return r;
    }
}
