public class Q14longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(prefix.length()>0){
                if(strs[i].indexOf(prefix)==0){
                    break;
                }else{
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
        }
        return prefix;
    }
}
