import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<len-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int begin=j+1;
                int end=len-1;
                while(end > begin){
                    int addSum=nums[i] + nums[j] + nums[begin] + nums[end];
                    if(addSum==target){
                        List<Integer> temp=new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[begin]);
                        temp.add(nums[end]);
                        result.add(temp);
                        begin++;
                        while(nums[begin]==nums[begin-1] && begin<len-2){
                            begin++;
                        }
                        end--;
                        while(nums[end]==nums[end+1] && end > 2){
                            end--;
                        }
                    }else if(addSum<target){
                        begin++;
                        while(nums[begin]==nums[begin-1] && begin<len-2){
                            begin++;
                        }
                    }else{
                        end--;
                        while(nums[end]==nums[end+1] && end > 2){
                            end--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
