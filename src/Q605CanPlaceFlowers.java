public class Q605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        for(int i=0;i<l;i++){
            if((i==0 || flowerbed[i-1]==0) && flowerbed[i]==0 && (i==l-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
        }
        if(n<=0){
            return true;
        }else{
            return false;
        }
    }
}
