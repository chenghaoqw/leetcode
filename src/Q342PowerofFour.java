public class Q342PowerofFour {
    public boolean isPowerOfFour(int num) {
        if(num==1) return true;
        if(num<1) return false;
        while(num%4==0){
            num/=4;
            if(num==1) return true;
        }
        return false;
    }
}
