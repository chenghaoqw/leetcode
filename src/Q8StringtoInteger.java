public class Q8StringtoInteger {
    public int myAtoi(String str) {
        int l=str.length();
        if(l==0){
            return 0;
        }
        long result=0;
        boolean start=false;
        boolean minus=false;
        for(int i=0;i<l;i++){
            char temp=str.charAt(i);
            if (temp >='0' && temp <='9'){
                result*=10;
                result+=temp-'0';
                start=true;
                if(minus){
                    if(result*-1<Integer.MIN_VALUE){
                        result=Integer.MIN_VALUE;
                        break;
                    }
                }else{
                    if(result>Integer.MAX_VALUE){
                        result=Integer.MAX_VALUE;
                        break;
                    }
                }
            }else {
                if(temp==' ' && !start){
                    continue;
                }else if((temp=='-' || temp=='+') && !start){
                    if(temp=='-'){
                        minus=true;
                    }
                    start=true;
                }else{
                    break;
                }
            }
        }
        if(minus){
            result*=-1;
        }
        return (int) result;
    }
}
