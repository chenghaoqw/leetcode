public class Q125ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(r>l){
            char cl=s.charAt(l);
            char cr=s.charAt(r);
            if(!((cl>='a' && cl<='z') || (cl>='A' && cl<='Z') || (cl>='0' && cl<='9'))) {
                l++;
                continue;
            }
            if(!((cr>='a' && cr<='z') || (cr>='A' && cr<='Z') || (cr>='0' && cr<='9'))) {
                r--;
                continue;
            }
            if(!String.valueOf(cl).toUpperCase().equals(String.valueOf(cr).toUpperCase())) return false;
            l++;
            r--;
        }
        return true;
    }
}
