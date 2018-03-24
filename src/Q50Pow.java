import java.util.Stack;

public class Q50Pow {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0) return myPow(1/x,-(n+1))/x;
        Stack<Integer> stack=new Stack();
        while(n>0){
            if(n % 2==1) {
                stack.add(1);
                n--;
            }else{
                stack.add(0);
                n/=2;
            }
        }
        double r=1.0;
        while(!stack.empty()){
            int t=stack.pop();
            if(t==1) r*=x;
            else r*=r;
        }
        return r;
    }
}
