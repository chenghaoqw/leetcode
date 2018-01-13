import java.util.ArrayList;
import java.util.HashMap;

public class Q290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        HashMap<String,String> map=new HashMap<>();
        ArrayList<String> list=new ArrayList<String>();
        String[] d1=str.split(" ");
        if(pattern.length() !=d1.length) return false;
        for(int i=0;i<pattern.length() && i<d1.length;i++){
            String key=Character.toString(pattern.charAt(i));
            if(map.containsKey(key)){
                if(!d1[i].equals(map.get(key))) return false;
            }else{
                map.put(key,d1[i]);
                if(list.contains(d1[i])) return false;
                list.add(d1[i]);
            }
        }
        return true;
    }
}
