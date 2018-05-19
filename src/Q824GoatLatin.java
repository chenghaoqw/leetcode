public class Q824GoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder r=new StringBuilder();
        String[] array=S.split(" ");
        for(int i=0;i<array.length;i++){
            String s=array[i];
            if(s.length()==0) continue;
            char c=s.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' || c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                r.append(s);
                r.append("ma");
            }else{
                r.append(s.substring(1,s.length()));
                r.append(s.substring(0,1));
                r.append("ma");
            }
            for(int j=0;j<=i;j++) r.append("a");
            if(i!=array.length-1) r.append(" ");
        }
        return r.toString();
    }
}
