public class Q507PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num ==0) return false;
        int sum=0;
        for(int i=1;i<Math.ceil(Math.sqrt(num));i++){
            if(num % i==0){
                if((double)i==Math.sqrt(num) || i==1) sum+=i;
                else{
                    sum+=i;
                    sum+=num/i;
                }
            }
        }
        return sum==num;
    }
}
