public class Q551StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        boolean l=false;
        int a=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A') a++;
            if(c=='L' && (i+1<s.length() && s.charAt(i+1)=='L') && (i+2<s.length() && s.charAt(i+2)=='L')) l=true;
        }

        return a<=1 && !l;
    }
}
