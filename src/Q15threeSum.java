import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15threeSum {
    private List<List<Integer>> result=new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            find(nums[i],nums,i+1,nums.length-1);
        }
        return result;

    }

    public void find(int target,int[] nums,int begin,int end){
        for(;end>begin;){
            int temp=nums[end] + nums[begin];
            if(temp>-target){
                end--;
                while(end >begin && nums[end] ==nums[end+1]){
                    end--;
                }
            }else if(temp<-target){
                begin++;
                while(end >begin && nums[begin] ==nums[begin-1]){
                    begin++;
                }
            }else{
                List<Integer> data=new ArrayList<Integer>();
                data.add(target);
                data.add(nums[begin]);
                data.add(nums[end]);
                result.add(data);
                end--;
                while(end >begin && nums[end] ==nums[end+1]){
                    end--;
                }
                begin++;
                while(end >begin && nums[begin] ==nums[begin-1]){
                    begin++;
                }
            }
        }
    }
}
