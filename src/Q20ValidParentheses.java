import java.util.Stack;

public class Q20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> data=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                data.push(s.charAt(i));
            }else{
                if(data.empty()){
                    return false;
                }
                if(data.peek()=='(' && s.charAt(i)==')'){
                    data.pop();
                }else if(data.peek()=='{' && s.charAt(i)=='}'){
                    data.pop();
                }
                else if(data.peek()=='[' && s.charAt(i)==']'){
                    data.pop();
                }else{
                    return false;
                }
            }
        }
        if(data.empty()){
            return true;
        }
        return false;
    }
}
