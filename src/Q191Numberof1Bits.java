public class Q191Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int r=0;
        for(int i=0;i<32;i++){
            r+=(n & 1);
            n = n >>1;
        }
        return r;
    }
}
