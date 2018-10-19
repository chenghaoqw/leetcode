import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q893GroupsofSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        for (int j = 0; j < A.length; j++) {
            String s = A[j];
            ArrayList<Character> list1 = new ArrayList();
            ArrayList<Character> list2 = new ArrayList();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) list1.add(s.charAt(i));
                else list2.add(s.charAt(i));
            }
            Collections.sort(list1);
            Collections.sort(list2);
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) list1.add(s.charAt(i));
                else list2.add(s.charAt(i));
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) builder.append(list1.get(i / 2));
                else builder.append(list2.get(i / 2));
            }
            A[j] = builder.toString();
        }
        HashMap<String, Integer> map = new HashMap();
        for (int j = 0; j < A.length; j++) {
            if (!map.containsKey(A[j])) map.put(A[j], 1);
            else map.put(A[j], map.get(A[j]) + 1);
        }
        return map.size();
    }
}