import java.util.HashSet;
import java.util.Stack;

public class Q433MinimumGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        Stack<String> stack = new Stack();
        HashSet<String> set = new HashSet();
        char[] ch = new char[]{'A', 'C', 'G', 'T'};
        for (String s : bank) set.add(s);
        if (!set.contains(end)) return -1;
        int count = 0;
        stack.add(start);
        while (!stack.empty()) {
            count++;
            Stack<String> stack1 = new Stack();
            for (int k = 0; k < stack.size(); k++) {
                String s = stack.get(k);
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < 4; j++) {
                        char[] array = s.toCharArray();
                        array[i] = ch[j];
                        String tar = new String(array);
                        if (end.equals(tar)) return count;
                        if (set.contains(tar) && !tar.equals("AAAACCCA")) {
                            stack1.add(tar);
                            set.remove(tar);
                        }
                    }
                }
            }
            stack = stack1;
        }
        return -1;
    }
}