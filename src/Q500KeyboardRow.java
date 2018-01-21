import java.util.ArrayList;
import java.util.HashMap;

public class Q500KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> r=new ArrayList<String>();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('Q',1);
        map.put('W',1);
        map.put('E',1);
        map.put('R',1);
        map.put('T',1);
        map.put('Y',1);
        map.put('U',1);
        map.put('I',1);
        map.put('O',1);
        map.put('P',1);
        map.put('A',2);
        map.put('S',2);
        map.put('D',2);
        map.put('F',2);
        map.put('G',2);
        map.put('H',2);
        map.put('J',2);
        map.put('K',2);
        map.put('L',2);
        map.put('Z',3);
        map.put('X',3);
        map.put('C',3);
        map.put('V',3);
        map.put('B',3);
        map.put('N',3);
        map.put('M',3);
        for(int i=0;i<words.length;i++){
            boolean is=true;
            String s=words[i].toUpperCase();
            int index=map.get(s.charAt(0));
            for(int j=1;j<s.length();j++){
                if(map.get(s.charAt(j))!=index) is=false;
            }
            if(is) r.add(words[i]);
        }
        String[] data=new String[r.size()];
        for(int i=0;i<r.size();i++){
            data[i]=r.get(i);
        }
        return data;
    }
}
