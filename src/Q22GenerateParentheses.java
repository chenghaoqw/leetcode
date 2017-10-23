import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q22GenerateParentheses {
    private List<String> result;
    public List<String> generateParenthesis(int n) {
        result=new ArrayList<String>();
        rec(new Stack<String>(),0,"",n);
        return result;
    }

    public void rec(Stack<String> data1,int n,String s,int end){
        Stack<String> data=new Stack<String>();
        data.addAll(data1);
        if(n<end){
            if(!data.empty()){
                data.pop();
                rec(data,n,s+")",end);
            }
            data=new Stack<String>();
            data.addAll(data1);
            data.add("(");
            rec(data,n+1,s+"(",end);
        }else{
            if(data.empty()){
                result.add(s);
            }else{
                data.pop();
                rec(data,n,s+")",end);
            }
        }
    }
}
