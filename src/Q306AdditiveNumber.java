import java.math.BigInteger;

public class Q306AdditiveNumber {
    boolean ret = false;

    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) return false;
        for (int i = 0; i <= num.length() / 2; i++) {
            ret = ret || isAdditiveNumber(num.substring(i + 1), num.substring(0, i + 1));
        }
        return ret;
    }

    public boolean isAdditiveNumber(String num, String left) {
        boolean ret = false;
        if (left.charAt(0) == '0' && left.length() > 1) return false;
        for (int i = 0; i <= num.length() / 2; i++) {
            if (num.length() > 0 && num.charAt(0) == '0' && i >= 1) break;
            String sum = (new BigInteger(num.substring(0, i + 1)).add(new BigInteger(left))).toString();
            if (num.substring(i + 1).startsWith(sum)) {
                if (i + sum.length() + 1 == num.length()) return true;
                ret = ret || isAdditiveNumber(num.substring(i + 1), num.substring(0, i + 1));
                if (ret) return ret;
            }
        }
        return ret;
    }
}