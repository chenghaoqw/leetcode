public class Q495TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int start=0;
        int end=0;
        int sum=0;
        for(int i=0;i<timeSeries.length;i++){
            if(end>timeSeries[i]){
                end=timeSeries[i]+duration;
            }
            else{
                sum=sum+end-start;
                start=timeSeries[i];
                end=start+duration;
            }
        }
        sum=sum+end-start;
        return sum;
    }
}
