import java.util.HashSet;
import java.util.Set;

public class Q365WaterandJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x<y) return canMeasureWater(y,x,z);
        if(x==z || y==z || x+y==z || z==0) return true;
        int t=x-y;
        Set<Integer> set=new HashSet<>();
        set.add(t);
        while(t!=z && x+t!=z && y+t!=z){
            if(t>y){
                t=t-y;
            }else if(t<y){
                t=t+x-y;
            }else{
                return false;
            }
            if(set.contains(t)) return false;
        }
        return true;
    }
}
