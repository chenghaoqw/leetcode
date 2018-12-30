public class Q481MagicalString {
    public int magicalString(int n) {
        if (n == 0) return 0;
        StringBuilder sb = new StringBuilder("122");
        int index = 2;
        int sum = 1;
        while (sb.length() < n) {
            String t = "1";
            if (sb.charAt(sb.length() - 1) == '1') t = "2";
            int count = sb.charAt(index++) - '0';
            for (int i = 0; i < count && sb.length() < n; i++) {
                sb.append(t);
                if ("1".equals(t)) sum++;
            }
        }
        return sum;
    }
}