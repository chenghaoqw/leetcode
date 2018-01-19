import java.util.HashMap;

public class Q447NumberofBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int r=0;
        for(int i=0;i<points.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(j==i) continue;
                int sum = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0])+ (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);
                if(!map.containsKey(sum)) map.put(sum,1);
                else map.put(sum,map.get(sum)+1);
            }
            for(int item:map.keySet()){
                int v=map.get(item);
                if(v>=2) r=r+v*(v-1);
            }
        }
        return r;
    }
}
