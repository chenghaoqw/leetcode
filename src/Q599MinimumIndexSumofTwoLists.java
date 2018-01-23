import java.util.ArrayList;
import java.util.HashMap;

public class Q599MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])) {
                int indexSum=i+map.get(list2[i]);
                if(indexSum<min){
                    min=indexSum;
                    list.clear();
                    list.add(list2[i]);
                }else if(indexSum==min){
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]) ;
    }
}
