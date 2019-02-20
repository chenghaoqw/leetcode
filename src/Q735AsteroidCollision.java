import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q735AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list=new ArrayList();
        Stack<Integer> stack=new Stack();
        for(int i:asteroids){
            if(i>0) stack.add(i);
            else{
                boolean skip=false;
                while(!stack.isEmpty()){
                    int t=stack.peek();
                    if(t>-i){
                        break;
                    }else if(t==-i){
                        stack.pop();
                        skip=true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
                if(skip) continue;
                if(stack.isEmpty()) list.add(i);
            }
        }
        list.addAll(stack);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}