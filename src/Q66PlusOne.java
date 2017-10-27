public class Q66PlusOne {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int j=1;
        int[] plus=new int[len+1];
        for(int i=len-1;i>=0;i--){
            if(j==1){
                if(digits[i] + j >=10){
                    plus[i+1] = 0;
                    j=1;
                }else{
                    plus[i+1] = digits[i] + j;
                    j=0;
                }
            }else{
                plus[i+1] = digits[i];
            }
        }
        if(j==0){
            int[] result=new int[len];
            for(int i=0;i<len;i++){
                result[i]=plus[i+1];
            }
            return result;
        }else{
            plus[0]=1;
            return plus;
        }
    }
}
