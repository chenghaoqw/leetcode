public class Q459RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        for(int i=1;i<=l/2;i++){
            if(l%i!=0) continue;
            String t= s.substring(0,i);
            boolean flag=true;
            for(int j=i;j+i<=l;j+=i){
                if(!s.substring(j,j+i).equals(t)){
                    flag=false;
                    break;
                }
            }
            if(flag) return true;
        }
        return false;

    }
}
