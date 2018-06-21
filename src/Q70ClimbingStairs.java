public class Q70ClimbingStairs {
    public int climbStairs(int n) {
        int[] r=new int[n+1];
        if(n<=0) return 0;
        else if(n<=1) return 1;
        else if(n<=2) return 2;
        r[1]=1;
        r[2]=2;
        for(int i=3;i<=n;i++){
            r[i]=r[i-2]+r[i-1];
        }
        return r[n];
    }
}
