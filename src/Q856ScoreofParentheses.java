import java.util.Stack;

public class Q856ScoreofParentheses {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        for (char c : S.toCharArray()) {
            if (c == '(') stack.add(0);
            else {
                int t = stack.pop();
                if (t == 0) {
                    stack.add(1);
                } else {
                    stack.pop();
                    stack.add(2 * t);
                }
                int sum = 0;
                while (!stack.isEmpty() && stack.peek() != 0) sum += stack.pop();
                stack.add(sum);
            }
        }
        return stack.pop();
    }
}