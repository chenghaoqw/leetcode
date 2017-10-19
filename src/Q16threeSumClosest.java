import java.util.Arrays;

public class Q16threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int closet=nums[0] + nums[1]+ nums[2];
        for(int i=0;i<nums.length-2;i++){
            int begin=i+1;
            int end=nums.length-1;
            int closetSum=nums[end] + nums[begin]+ nums[i];
            while(end > begin){
                int sum=nums[end] + nums[begin]+ nums[i];
                if(sum < target){
                    if(target -sum< Math.abs(closetSum-target)){
                        closetSum=sum;
                    }
                    begin++;
                }else if(sum > target){
                    if(sum - target< Math.abs(closetSum-target)){
                        closetSum=sum;
                    }
                    end--;
                }else{
                    return target;
                }
            }
            if(Math.abs(closet-target) > Math.abs(closetSum - target)){
                closet=closetSum;
            }

        }
        return closet;
    }
}
