import java.util.ArrayList;
import java.util.List;

public class Q229MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> r=new ArrayList<Integer>();
        int con1=0,count1=0,con2=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==con1) count1++;
            else if(nums[i]==con2) count2++;
            else if(count1==0){
                con1=nums[i];
                count1=1;
            }
            else if(count2==0){
                con2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==con1) count1++;
            else if(nums[i]==con2) count2++;
        }
        if(count1 > nums.length/3) r.add(con1);
        if(count2 > nums.length/3) r.add(con2);
        return r;
    }
}
