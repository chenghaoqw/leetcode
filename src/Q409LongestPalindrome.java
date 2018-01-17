import java.util.HashMap;

public class Q409LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> data=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character t=s.charAt(i);
            if(!data.containsKey(t)) data.put(t,1);
            else data.put(t,data.get(t)+1);
        }
        int r=0;
        for(Character key:data.keySet())
        {
            r+=data.get(key) % 2;
        }

        if(r>1) return s.length()-r+1;
        else return s.length();

    }
}
