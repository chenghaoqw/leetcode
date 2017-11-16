public class Q7171bitand2bitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1]==1){
            return false;
        }
        int i=0;
        for(;i<bits.length-1;){
            if(bits[i]==0){
                i++;
            }else{
                i=i+2;
            }
        }
        if(i==bits.length-1){
            return true;
        }
        return false;
    }
}
