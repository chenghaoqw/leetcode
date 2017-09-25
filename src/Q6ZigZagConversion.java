public class Q6ZigZagConversion {
    public String convert(String s, int numRows) {
        if ("".equals(s) || numRows == 1) {
            return s;
        }
        int l = s.length();
        int index = 0;
        char[] result = new char[l];
        for (int i = 0; i < numRows && i < l; i++) {
            result[index] = s.charAt(i);
            index++;
            boolean first = true;
            for (int j = i; j < l; ) {
                int temp = 0;
                if (first) {
                    temp = 2 * numRows - 2 * i - 2;
                } else {
                    temp = 2 * i;
                }
                if (temp != 0) {
                    j += temp;
                    if (j < l) {
                        result[index] = s.charAt(j);
                        index++;
                    }
                }
                first = first ? false : true;
            }
        }
        return new String(result);
    }
}
