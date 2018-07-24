public class Q482LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s=new StringBuilder();
        char[] array=S.toCharArray();
        int count=0;
        for(int i=array.length-1;i>=0;i--){
            char c=array[i];
            if(c=='-'){
                if(i==0) break;
                if(count>=K) {
                    count=0;
                    s.insert(0,c);
                }
                continue;
            }
            count++;
            if(count<K){
                s.insert(0,c);
            }else{
                s.insert(0,c);
                s.insert(0,'-');
                count=0;
            }
        }
        String r=s.toString().toUpperCase();
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-') t++;
            else break;
        }
        return r.substring(t,r.length());
    }
}
