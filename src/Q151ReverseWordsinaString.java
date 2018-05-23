public class Q151ReverseWordsinaString {
    public String reverseWords(String s) {
        int left=-1;
        int right=0;
        StringBuilder r=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' ' && left==-1) {
                left=i;
            }
            if(left !=-1 && (c== ' ' || i==s.length()-1)) {
                if(c== ' ') right=i;
                else right=i+1;
                if(r.length()!=0) r.insert(0," ");
                r.insert(0,s.substring(left,right));
                left=-1;
            }
        }
        return r.toString();
    }
}
