public class Q168ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuffer r=new StringBuffer();
        while(n>0){
            int c=n%26;
            if(c==0) {
                c=26;
                n-=26;
            }
            r.insert(0,(char)(c-1+'A'));
            n/=26;
        }
        return r.toString();
    }
}
