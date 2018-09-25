import java.util.ArrayList;
import java.util.List;

public class Q784LetterCasePermutation {
    List<String> list = new ArrayList();

    public List<String> letterCasePermutation(String S) {
        ref(S.toCharArray(), 0);
        return list;
    }

    public void ref(char[] s, int l) {
        for (int i = l; i < s.length; i++) {
            if (Character.isLetter(s[i])) {
                char[] s1 = new char[s.length];
                for (int k = 0; k < s.length; k++) {
                    s1[k] = s[k];
                }
                if (Character.isLowerCase(s[i])) {
                    s1[i] = (char) (s[i] + ('A' - 'a'));
                } else {
                    s1[i] = (char) (s[i] + ('a' - 'A'));
                }
                ref(s1, i + 1);
            }
        }
        list.add(new String(s));
    }
}