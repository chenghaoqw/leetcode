public class Q6502KeysKeyboard {
    public int minSteps(int n) {
        int ans=0,d=2;
        while(n>1){
            while(n%d==0){
                n/=d;
                ans+=d;
            }
            d++;
        }
        return ans;
    }
}