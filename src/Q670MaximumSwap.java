public class Q670MaximumSwap {
    public int maximumSwap(int num) {
        char[] a=Integer.toString(num).toCharArray();
        for(int i=0;i<a.length;i++){
            char n= a[i];
            int t=-1;
            for(int j=i+1;j<a.length;j++){
                if(a[j] >= n){
                    n=a[j];
                    t=j;
                }
            }
            if(a[i] !=n){
                a[t]=a[i];
                a[i]=n;
                break;
            }
        }
        return Integer.valueOf(new String(a));
    }
}
