public class Q402RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) return "0";
        int index = 0;
        while (k > 0 && index + k < num.length()) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= k; i++) {
                min = Math.min(min, Integer.parseInt(num.substring(i + index, i + index + 1)));
            }
            for (int i = 0; i <= k; i++) {
                if (min == Integer.parseInt(num.substring(i + index, i + index + 1))) {
                    k -= i;
                    num = num.substring(0, index) + num.substring(index + i);
                    index++;
                    break;
                }
            }
        }
        if (k >= num.length()) k = num.length() - 1;
        if (k > 0) num = num.substring(0, num.length() - k);
        int zero = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) != '0') break;
            zero++;
        }
        return num.substring(zero);
    }
}