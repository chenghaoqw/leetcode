import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Q819MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new TreeSet<String>();
        for(String s:banned) set.add(s);
        paragraph=paragraph.toLowerCase();
        String[] array=paragraph.split(" ");
        Map<String,Integer> map=new HashMap();
        String ans="";
        int max=0;
        for(int i=0;i<array.length;i++){
            String item=array[i];
            if(item.length()<=0) continue;
            if(!Character.isLetter(item.charAt(item.length()-1))) item=item.substring(0,item.length()-1);
            if(set.contains(item)) continue;
            map.put(item,map.getOrDefault(item,0)+1);
            if(map.get(item)>max) {
                ans=item;
                max=map.get(item);
            }
        }
        return ans;
    }
}
