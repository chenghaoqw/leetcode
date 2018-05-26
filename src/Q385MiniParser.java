import java.util.List;
import java.util.Stack;

public class Q385MiniParser {
    public NestedInteger deserialize(String s) {
        NestedInteger nest = new NestedInteger();
        if (s.length() == 0) return nest;
        if (s.charAt(0) == '[') s = s.substring(1, s.length() - 1);
        else {
            nest.setInteger(Integer.valueOf(s));
            return nest;
        }
        int left = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') stack.push(1);
            else if (c == ']') stack.pop();
            if ((c == ',' || i == s.length() - 1) && stack.empty()) {
                if (i == s.length() - 1) i++;
                nest.add(deserialize(s.substring(left, i)));
                left = i + 1;
            }
        }
        return nest;
    }

    class NestedInteger {
        // Constructor initializes an empty nested list.
        public NestedInteger() {

        }

        // Constructor initializes a single integer.
        public NestedInteger(int value) {

        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return false;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return 1;
        }

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {
        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {
        }


    }
}
