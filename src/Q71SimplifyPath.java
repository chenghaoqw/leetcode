import java.util.Stack;

public class Q71SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack();
        int pre=0;
        int cur=0;
        boolean flag=true;
        for(int i=1;i<path.length();i++){
            if(path.charAt(i)=='/' || i==path.length()-1) {
                if(i==path.length()-1 && path.charAt(i)!='/') i=path.length();
                cur=i;
            }
            else continue;
            String s=path.substring(pre+1,cur);
            pre=cur;
            if(s.length()==0) {
                flag=false;
                continue;
            }
            if(".".equals(s)) continue;
            if("..".equals(s)) {
                if(!stack.empty())
                    stack.pop();
            }
            else stack.push(s);
        }
        StringBuilder r=new StringBuilder("/");
        if(stack.empty()) return "/";
        while(!stack.empty()){
            r.insert(0,stack.pop());
            r.insert(0,"/");
        }
        return r.toString().substring(0,r.length()-1);
    }
}
