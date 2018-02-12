import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q609FindDuplicateFileinSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>> map=new HashMap();
        for(int i=0;i<paths.length;i++){
            String[] info=paths[i].split(" ");
            String pre=info[0];
            for(int j=1;j<info.length;j++){
                int cs=info[j].indexOf("(");
                String content=info[j].substring(cs+1,info[j].length());
                String path=pre+"/"+info[j].substring(0,cs);
                if(map.containsKey(content)) map.get(content).add(path);
                else{
                    List<String> list=new ArrayList();
                    list.add(path);
                    map.put(content,list);
                }
            }
        }
        List<List<String>> r=new ArrayList();
        for(String content:map.keySet()){
            if(map.get(content).size()>=2) r.add(map.get(content));
        }
        return r;
    }
}
