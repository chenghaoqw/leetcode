public class Q7ReverseInteger {
    public int reverse(int x) {
        boolean isMinus = false;
        if (x < 0) {
            isMinus = true;
            x = x * -1;
        }
        long result = 0;
        while (x != 0) {
            result = result * 10;
            result += x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        if (isMinus) {
            result = result * -1;
        }
        return (int) result;
    }
}
