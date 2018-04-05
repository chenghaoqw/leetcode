public class Q396RotateFunction {
    public int maxRotateFunction(int[] A) {
        int sum=0;
        int count=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            count+=i*A[i];
        }
        int max=count;
        for(int i=1;i<A.length;i++){
            int t=sum-A[A.length-i]*A.length;
            count+=t;
            if(count>max) max=count;
        }
        return max;
    }
}
