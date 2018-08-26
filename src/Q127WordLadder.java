import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Q127WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int count = 1;
        Stack<String> stack = new Stack();
        stack.add(beginWord);
        while (!stack.empty()) {
            count++;
            Stack<String> stack1 = new Stack();
            Set<String> wordSet = new HashSet<>(wordList);
            if (!wordSet.contains(endWord)) return 0;
            while (!stack.empty()) {
                String string = stack.pop();
                wordSet.remove(string);
                for (int i = 0; i < string.length(); i++) {
                    for (int j = 0; j <= 'z' - 'a'; j++) {
                        char[] c = string.toCharArray();
                        c[i] = (char) ('a' + j);
                        String temp = new String(c);
                        if (wordSet.contains(temp)) {
                            if (temp.equals(endWord)) return count;
                            wordSet.remove(temp);
                            stack1.add(temp);
                        }
                    }
                }
            }
            stack = stack1;
        }
        return 0;
    }
}