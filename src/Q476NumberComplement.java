public class Q476NumberComplement {
    public int findComplement(int num) {
        int mask = Integer.MAX_VALUE;
        while ((mask & num) !=0) mask <<= 1;
        return ~mask & ~num;
    }
}
