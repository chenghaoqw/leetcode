public class Q275HIndexII {
    public int hIndex(int[] citations) {
        int l=0;
        int r=citations.length-1;
        while(r>=l){
            int mid=l+(r-l)/2;
            int index=citations[mid];
            if(index==citations.length-mid) return citations.length-mid;
            else if(index>citations.length-mid) r=mid-1;
            else l=mid+1;
        }
        return citations.length-l;
    }
}
