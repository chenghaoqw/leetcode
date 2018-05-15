public class Q686RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        if(A.length() ==0 || B.length()==0) return 0;
        int count=1;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(0)){
                int l=i+1;
                count=1;
                int r=1;
                while(true){
                    if(r>=B.length()) return count;
                    if(l==A.length()) {
                        l=0;
                        count++;
                    }
                    if(A.charAt(l)!=B.charAt(r)) break;
                    else {
                        r++;
                        l++;
                    }
                }
            }
        }
        return -1;
    }
}
