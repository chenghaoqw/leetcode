public class Q413ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int sum=0;
        if(A.length<3) return 0;
        int count=1;
        int t1=A[1]-A[0];
        for(int i=1;i<A.length-1;i++){
            int t2=A[i+1]-A[i];
            if(t1==t2) count++;
            else{
                if(count>=2) {
                    for(int j=count-1;j>=1;j--) sum+=j;
                    count=1;
                }
            }
            t1=t2;
        }
        if(count>=2){
            for(int j=count-1;j>=1;j--) sum+=j;
        }
        return sum;
    }
}
