public class Q647PalindromicSubstrings {
    public int countSubstrings(String s) {
        int ans=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<l && s.charAt(left)==s.charAt(right)){
                ans++;
                left--;
                right++;
            }
            left=i-1;
            right=i;
            while(left>=0 && right<l && s.charAt(left)==s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
