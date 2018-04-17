public class Q754ReachaNumber {
    public int reachNumber(int target) {
        if(target<0) return reachNumber(-target);
        int sum=0,count=1;
        while(sum < target || sum%2!=target%2){
            if(sum==target) return count-1;
            sum+=count;
            count++;
        }
        return count-1;
    }
}
