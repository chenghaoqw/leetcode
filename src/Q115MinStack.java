import java.util.Stack;

public class Q115MinStack {
    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack();
    /** initialize your data structure here. */
    public Q115MinStack() {

    }

    public void push(int x) {
        s1.push(x);
        if(s2.empty() || x<=s2.peek()) s2.push(x);
    }

    public void pop() {
        int t=s1.pop();
        if(s2.peek()==t) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
