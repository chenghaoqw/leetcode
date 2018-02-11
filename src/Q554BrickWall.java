import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q554BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map=new HashMap();
        map.put(-1,0);
        for(int i=0;i<wall.size();i++){
            int index=0;
            List<Integer> list=wall.get(i);
            for(int j=0;j<list.size()-1;j++){
                index+=list.get(j);
                if(map.containsKey(index)) map.put(index,map.get(index)+1);
                else map.put(index,1);
            }
        }
        int r= Collections.max(map.values());
        return wall.size()-r;
    }
}
