import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q438FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        ArrayList<Integer> r=new ArrayList<>();
        int l1=s.length(),l2=p.length();
        for(int i=0;i<l2;i++){
            char c=p.charAt(i);
            h1.put(c,0);
            h2.put(c,0);
        }
        for(int i=0;i<l2;i++){
            char c=p.charAt(i);
            h2.put(c,h2.get(c)+1);
        }
        int count=0;
        for(int i=0;i<l1;i++){
            char c=s.charAt(i);
            if(h2.containsKey(c)){
                h1.put(c,h1.get(c)+1);
                h2.put(c,h2.get(c)-1);
                if(h2.get(c) >=0) count++;
            }
            if(i>=l2){
                char c1=s.charAt(i-l2);
                if(h2.containsKey(c1)){
                    h2.put(c1,h2.get(c1)+1);
                    h1.put(c1,h2.get(c1)-1);
                    if(h2.get(c1) >=1) count--;
                }
            }
            if(count==l2) r.add(i-l2+1);
        }
        return r;
    }
}
