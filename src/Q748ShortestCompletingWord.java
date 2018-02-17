import java.util.HashMap;

public class Q748ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> map=new HashMap();
        licensePlate=licensePlate.toLowerCase();
        for(int i=0;i<licensePlate.length();i++){
            char c=licensePlate.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }
        String r="";
        int index=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int count=0;
            HashMap<Character,Integer> tempMap=new HashMap();
            for(int j=0;j<word.length();j++){
                if(map.containsKey(word.charAt(j))) {
                    if(!tempMap.containsKey(word.charAt(j))) {
                        count++;
                        tempMap.put(word.charAt(j),1);
                    }else{
                        if(tempMap.get(word.charAt(j))<map.get(word.charAt(j))){
                            count++;
                            tempMap.put(word.charAt(j),tempMap.get(word.charAt(j))+1);
                        }
                    }
                }
            }
            if(count>index || (count==index && word.length()<r.length())) {
                r=word;
                index=count;
            }
        }
        return r;
    }
}
