public class Q696CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int ans=0,prev=0,cur=1;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            char c1=s.charAt(i-1);
            if(c==c1) cur++;
            else{
                ans+=Math.min(prev,cur);
                int t=cur;
                cur=1;
                prev=t;
            }
        }
        return ans+Math.min(prev,cur);
    }
}
