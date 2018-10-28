public class Q201BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while (m != n) {
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        if (m == 0 || n == 0) return 0;
        while (count > 0) {
            m = m << 1;
            count--;
        }
        return m;
    }
}