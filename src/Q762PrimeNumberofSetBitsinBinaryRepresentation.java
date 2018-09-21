public class Q762PrimeNumberofSetBitsinBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int ret = 0;
        for (int i = L; i <= R; i++) {
            int count = getCount(i);
            if (isShu(count)) {
                ret++;
            }
        }
        return ret;
    }

    public int getCount(int val) {
        int count = 0;
        while (val > 0) {
            count += val & 1;
            val = val >> 1;
        }
        return count;
    }

    public boolean isShu(int val) {
        if (val <= 1) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
}