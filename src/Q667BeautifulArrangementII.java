public class Q667BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] r=new int[n];
        r[0]=1;
        for(int i=1;i<k+1;i++){
            if(i % 2 == 1) r[i]=r[i-1] + k-i+1;
            else r[i] = r[i-1] + i - k -1;
        }
        for(int i=k+1;i<n;i++){
            r[i]=i+1;
        }
        return r;
    }
}
