import java.util.Arrays;

public class Q475Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res=-1;
        for(int house : houses){
            int index=Arrays.binarySearch(heaters,house);
            if(index<0) index=-index-1;
            int dist1=index>=1 ? house-heaters[index-1]:Integer.MAX_VALUE;
            int dist2=index<heaters.length ? -house+heaters[index]:Integer.MAX_VALUE;
            res=Math.max(Math.min(dist1,dist2),res);
        }
        return res;
    }
}
