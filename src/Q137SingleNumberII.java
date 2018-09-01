public class Q137SingleNumberII {
    public int singleNumber(int[] nums) {
        int one=0;
        int two=0;
        int three=0;
        for(int i:nums){
            two|=one&i;
            one^=i;
            three=two&one;
            one&=~three;
            two&=~three;
        }
        return one;
    }
}