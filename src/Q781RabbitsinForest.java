import java.util.HashMap;

public class Q781RabbitsinForest {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<answers.length;i++) if(map.containsKey(answers[i])) map.put(answers[i],map.get(answers[i])+1);
        else map.put(answers[i],1);
        int sum=0;
        for(int key:map.keySet()){
            int value=map.get(key);
            int pair=(int)Math.ceil((float)value/(float)(key+1));
            sum+=pair*(key+1);
        }
        return sum;
    }
}
