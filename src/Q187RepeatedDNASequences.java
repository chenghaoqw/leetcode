import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q187RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map=new HashMap();
        List<String> list=new ArrayList();
        for(int i=0;i<s.length()-9;i++){
            String t=s.substring(i,i+10);
            if(map.containsKey(t) && !list.contains(t)) list.add(t);
            else map.put(t,1);
        }
        return list;
    }
}
