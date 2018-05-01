public class Q38CountandSay {
    public String countAndSay(int n) {
        if(n==0) return "";
        String r="1";
        for(int i=1;i<n;i++){
            String t=r;
            r="";
            char c=t.charAt(0);
            int count=1;
            for(int j=1;j<t.length();j++){
                if(t.charAt(j)==c) count++;
                else{
                    r+=count+String.valueOf(c);
                    c=t.charAt(j);
                    count=1;
                }
            }
            r+=count+String.valueOf(t.charAt(t.length()-1));
        }
        return r;
    }
}
