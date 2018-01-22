import java.util.HashMap;

public class Q575DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<candies.length;i++){
            if(!data.containsKey(candies[i])) data.put(candies[i],1);
        }
        int len=data.size();
        return len > candies.length /2 ? candies.length/2 : len;
    }
}
