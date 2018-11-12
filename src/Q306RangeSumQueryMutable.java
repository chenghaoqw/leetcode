public class Q306RangeSumQueryMutable {
    int[] array;
    public Q306RangeSumQueryMutable(int[] nums) {
        array=nums;
    }

    public void update(int i, int val) {
        array[i]=val;
    }

    public int sumRange(int i, int j) {
        int sum=0;
        for(int index=i;index<=j;index++) sum+=array[index];
        return sum;
    }
}
