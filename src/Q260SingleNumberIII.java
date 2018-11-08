public class Q260SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int t = 0;
        int ret[] = new int[2];
        for (int i : nums) {
            t ^= i;
        }
        t &= -t;
        for (int i : nums) {
            if ((i & t) == 0) ret[0] ^= i;
            else ret[1] ^= i;
        }
        return ret;
    }
}