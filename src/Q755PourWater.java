public class Q755PourWater {
    public int[] pourWater(int[] heights, int V, int K) {
        for(int i=0;i<V;i++){
            int k=K;
            for(int j=K;j>=0;j--){
                if(j==0 || heights[j-1] > heights[j]) break;
                else if(heights[j] > heights[j-1]) k=j-1;
            }
            if(k!=K){
                heights[k]++;
                continue;
            }
            for(int j=K;j<heights.length;j++){
                if(j==heights.length-1 || heights[j+1] >heights[j]) break;
                else if(heights[j] > heights[j+1]) k=j+1;
            }
            heights[k]++;
        }
        return heights;
    }
}
