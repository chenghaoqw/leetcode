import java.util.ArrayList;
import java.util.List;

public class Q228SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> r=new ArrayList<String>();
        int l=nums.length;
        if(l<1) return r;
        int left=0;
        int len=1;
        for(int i=1;i<l;i++){
            if(nums[i]!=nums[i-1]+1){
                len=i-left;
                if(len==1){
                    r.add(String.valueOf(nums[i-1]));
                }else if(len >1){
                    r.add(nums[left]+"->"+nums[i-1]);
                }
                left=i;
            }
        }
        len=l-left;
        if(len==1){
            r.add(String.valueOf(nums[l-1]));
        }else if(len >1){
            r.add(nums[left]+"->"+nums[l-1]);
        }
        return r;
    }
}
