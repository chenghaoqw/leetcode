public class Q443StringCompression {
    public int compress(char[] chars) {
        if(chars.length==0 ||chars.length==1) return chars.length;
        int left=0,sum=0;
        for(int i=0;i<chars.length;i++){
            if(i==chars.length-1 || chars[i]!=chars[i+1]){
                chars[sum]=chars[i];
                if(i-left!=0){
                    String count=(i-left+1)+"";
                    for(int j=0;j<count.length();j++){
                        sum++;
                        chars[sum]=(char)(count.charAt(j));
                    }
                }
                sum++;
                left=i+1;
            }
        }
        return sum;
    }
}
