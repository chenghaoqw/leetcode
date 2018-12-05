public class Q394DecodeString {
    public String decodeString(String s) {
        char[] array = s.toCharArray();
        while (s.contains("]")) {
            int right = s.indexOf("]");
            int left = s.substring(0, right).lastIndexOf("[");
            StringBuilder mid = new StringBuilder();
            int i = left - 1;
            for (; i >= 0 && s.charAt(i) >= '0' && s.charAt(i) <= '9'; i--) ;
            i++;
            if (i < left)
                for (int k = 0; k < Integer.parseInt(s.substring(i, left)); k++) mid.append(s, left + 1, right);
            s = s.substring(0, i) + mid + s.substring(right + 1);
        }
        return s;
    }
}