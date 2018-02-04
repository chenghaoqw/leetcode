import java.util.HashMap;

public class Q299BullsandCows {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map=new HashMap();
        int a=0;
        int b=0;
        for(int i=0;i<secret.length();i++){
            char c=secret.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for(int i=0;i<guess.length();i++){
            char c=guess.charAt(i);
            if(c==secret.charAt(i)){
                if(map.get(c)<1) b--;
                map.put(c,map.get(c)-1);
                a++;
            }else if(map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
                b++;
            }
        }
        return a+"A"+b+"B";
    }
}
