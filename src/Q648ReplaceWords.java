import java.util.HashMap;
import java.util.List;

public class Q648ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<dict.size();i++){
            map.put(dict.get(i),1);
        }
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length();j++){
                String card=s[i].substring(0,j);
                if(map.containsKey(card)){
                    s[i]=card;
                }
            }
        }
        StringBuffer r=new StringBuffer();
        for(int i=0;i<s.length;i++){
            r.append(s[i]);
            if(i!=s.length-1) r.append(" ");
        }
        return r.toString();
    }
}
