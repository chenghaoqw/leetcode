public class Q458PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int i=0;
        while(Math.pow(minutesToTest/minutesToDie+1,i)<buckets){
            i++;
        }
        return i;
    }
}
