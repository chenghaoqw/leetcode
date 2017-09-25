import java.util.HashMap;

class Q3lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int len=s.length();
        int flag=0;
        int result=0;
        int nowResult=0;
        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i))==null){
                nowResult+=1;
                map.put(s.charAt(i),i);
                if(nowResult>result){
                    result=nowResult;
                }
            }else{
                int j=map.get(s.charAt(i));
                map.put(s.charAt(i),i);
                if(j<flag){
                    j=flag;
                }else{
                    flag=j;
                }
                nowResult=i-j;
                if(nowResult>result){
                    result=nowResult;
                }

            }
        }
        return result;
    }
}
