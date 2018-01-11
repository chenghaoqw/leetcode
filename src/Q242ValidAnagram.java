import java.util.ArrayList;
import java.util.Collections;

public class Q242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return getList(s).equals(getList(t));
    }

    public ArrayList<Character> getList(String s){
        ArrayList<Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list);
        return list;
    }
}
