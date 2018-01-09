public class Q204CountPrimes {
    public int countPrimes(int n) {
        int count=0;
        if(n<2) return 0;
        boolean[] f=new boolean[n];
        f[0]=true;f[1]=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=2;i*j<n;j++) f[i*j]=true;
        }
        for(int i=0;i<n;i++)
            if(!f[i]) count++;
        return count;
    }
}
