public class Q67AddBinary {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int la = a.length();
        int lb = b.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < la || i < lb || carry > 0; i++) {
            char ca = '0';
            char cb = '0';
            if (i < la) ca = a.charAt(i);
            if (i < lb) cb = b.charAt(i);
            if (ca == '1' && cb == '1') {
                if (carry == 1) result.insert(0, "1");
                else result.insert(0, "0");
                carry = 1;
            } else if (ca == '0' && cb == '0') {
                if (carry == 1) {
                    result.insert(0, "1");
                    carry = 0;
                } else result.insert(0, "0");
            } else {
                if (carry == 1) {
                    result.insert(0, "0");
                } else result.insert(0, "1");
            }
        }
        return result.toString();
    }
}
