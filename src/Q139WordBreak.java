import java.util.List;

public class Q139WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] result=new int[s.length()+1];
        result[0]=1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j>=0;j--){
                if(result[i-j]==1 && wordDict.contains(s.substring(i-j,i+1))){
                    result[i+1]=1;
                    break;
                }
            }
        }
        return result[s.length()]==1;
    }
}