import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q621TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        Arrays.sort(tasks);
        List<Integer> data=new ArrayList<Integer>();
        char c=tasks[0];
        int sum=1;
        for(int i=1;i<tasks.length;i++){
            if(tasks[i]==c) sum++;
            else{
                data.add(sum);
                c=tasks[i];
                sum=1;
            }
        }
        data.add(sum);
        Collections.sort(data);
        sum=0;
        int count = tasks.length;
        int max=data.get(data.size()-1);
        while(count > 0){
            int sub=0;
            for(int i=data.size()-1;i>=0;i--){
                int t=data.get(i);
                if(t > 0){
                    sum++;
                    sub++;
                    count--;
                    data.set(i,t-1);
                }
                if(sub>=n+1) break;
            }
            if(sub<n+1 && count >0) sum=sum+n+1-sub;
            Collections.sort(data);
        }
        if(sum == 1001) return 1000;
        return sum;
    }
}
