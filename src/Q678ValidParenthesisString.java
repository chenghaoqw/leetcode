public class Q678ValidParenthesisString {
    public boolean checkValidString(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') left++;
            else left --;
            if(c!=')') right++;
            else right--;
            if(right<0) break;
            left=Math.max(left,0);
        }
        return left==0;
    }
}
