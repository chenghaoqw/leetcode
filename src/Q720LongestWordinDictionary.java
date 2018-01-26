import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q720LongestWordinDictionary {
    public String longestWord(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            list.add(words[i]);
        }
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                if(s2.length()-s1.length()==0) return s1.compareTo(s2);
                return s2.length()-s1.length();
            }
        });
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            int j=s.length();
            boolean is=true;
            while(is){
                for(int k=i;k<list.size();k++){
                    if(s.substring(0,j).equals(list.get(k))){
                        if(j==1) return list.get(i);
                        j--;
                        is=true;
                        break;
                    }else{
                        is=false;
                    }
                }
            }
        }
        return "";
    }
}
