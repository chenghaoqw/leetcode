import java.util.HashMap;

public class Q389FindtheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> data=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!data.containsKey(c)) data.put(c,1);
            else data.put(c,data.get(c)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!data.containsKey(c) || data.get(c) <1) return c;
            else data.put(c,data.get(c)-1);
        }
        return 'c';
    }
}
