public class Q303RangeSumQueryImmutable {
    int[] data;
    public Q303RangeSumQueryImmutable(int[] nums) {
        data=nums;
    }

    public int sumRange(int i, int j) {
        int result=0;
        for(int index=i;index<=j;index++){
            result+=data[index];
        }
        return result;
    }
}
