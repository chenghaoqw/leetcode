import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q539MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list=new ArrayList();
        for(String s:timePoints){
            String[] array=s.split(":");
            list.add(Integer.valueOf(array[0])*60+Integer.valueOf(array[1]));
        }
        Collections.sort(list);
        int min=24*60;
        for(int i=1;i<list.size();i++){
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        min=Math.min(min,24*60-list.get(list.size()-1)+list.get(0));
        return min;
    }
}
