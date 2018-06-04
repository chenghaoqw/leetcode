import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Q767ReorganizeString {
    public String reorganizeString(String S) {
        HashMap<Character,Integer> map=new HashMap();
        char[] array=S.toCharArray();
        for(int i=0;i<array.length;i++){
            int t=map.getOrDefault(array[i],0)+1;
            map.put(array[i],t);
        }
        int max= Collections.max(map.values());
        if(max > (array.length+1)/2) return "";
        String[] r=new String[max];
        String result="";
        for(char c:map.keySet()){
            if(map.get(c)==max){
                for(int i=0;i<max;i++){
                    r[i]=c+"";
                }
                map.remove(c);
                break;
            }
        }
        int target=array.length-max;
        Iterator<Character> iter = map.keySet().iterator();
        int index=0;
        while(iter.hasNext()){
            char c=iter.next();
            for(int i=0;i<map.get(c);i++){
                r[index]+=c;
                index++;
                if(index==max) index=0;
            }
        }
        for(int i=0;i<r.length;i++) result+=r[i];
        return result;
    }
}

