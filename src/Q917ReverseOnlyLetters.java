import java.util.ArrayList;
import java.util.List;

public class Q917ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] a1 = S.toCharArray();
        char[] a2 = new char[a1.length];
        List<Character> list = new ArrayList();
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            char c = a1[i];
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) list.add(c);
        }
        for (int i = 0; i < a1.length; i++) {
            char c = a1[i];
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                a2[i] = list.get(list.size() - 1 - count);
                count++;
            } else {
                a2[i] = a1[i];
            }
        }
        return new String(a2);
    }
}