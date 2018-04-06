public class Q397IntegerReplacement {
    public int integerReplacement(int n1) {
        int count=0;
        long n=(long) n1;
        while(n!=1){
            if(n==3) return count+2;
            count++;
            if(n%2==0){
                n/=2;
                continue;
            }
            if(n % 4==3) n++;
            else n--;
        }
        return count;
    }
}
