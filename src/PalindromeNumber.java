public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int y=x;
        long result=0;
        for(;x>0;){
            result=result*10+x%10;
            x/=10;
        }
        if(y==result){
            return true;
        }else{
            return false;
        }
    }
}
