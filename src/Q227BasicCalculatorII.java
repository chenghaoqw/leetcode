import java.util.Stack;

public class Q227BasicCalculatorII {
    public int calculate(String s) {
        int left=0;
        char op='+';
        Stack<Integer> stack=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='/' || c=='*' || c=='+' || c=='-' || i==s.length()-1) {
                if(i==s.length()-1) i++;
                if(op=='/') stack.push(stack.pop()/Integer.valueOf(s.substring(left,i).trim()));
                if(op=='*') stack.push(stack.pop()*Integer.valueOf(s.substring(left,i).trim()));
                if(op=='+') stack.push(Integer.valueOf(s.substring(left,i).trim()));
                if(op=='-') stack.push(-Integer.valueOf(s.substring(left,i).trim()));
                left=i+1;
                op=c;
            }
        }
        int r=0;
        while(!stack.empty()){
            r+=stack.pop();
        }
        return r;
    }
}
