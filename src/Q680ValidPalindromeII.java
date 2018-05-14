public class Q680ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(r>l){
            char cl=s.charAt(l);
            char cr=s.charAt(r);
            if(cl!=cr){
                if(r==l+1) return true;
                return isValid(s.substring(l,r)) || isValid(s.substring(l+1,r+1));
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isValid(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
