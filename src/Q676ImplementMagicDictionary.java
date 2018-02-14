import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q676ImplementMagicDictionary {
    HashMap<Integer,List<String>> map=new HashMap();
    /** Initialize your data structure here. */
    public Q676ImplementMagicDictionary() {

    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(int i=0;i<dict.length;i++){
            if(map.containsKey(dict[i].length())) map.get(dict[i].length()).add(dict[i]);
            else{
                List<String> list=new ArrayList<String>();
                list.add(dict[i]);
                map.put(dict[i].length(),list);
            }
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        if(!map.containsKey(word.length())) return false;
        List<String> list=map.get(word.length());
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==word.charAt(j)) count++;
            }
            if(count==s.length()-1) return true;
        }
        return false;
    }
}
