import java.util.Stack;

public class Q150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                int i2 = stack.pop();
                int i1 = stack.pop();
                int r = 0;
                if (s.equals("+")) r += i1 + i2;
                if (s.equals("-")) r += i1 - i2;
                if (s.equals("*")) r += i1 * i2;
                if (s.equals("/")) r += i1 / i2;
                stack.add(r);
            } else {
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}