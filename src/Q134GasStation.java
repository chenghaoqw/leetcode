public class Q134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] array=new int[gas.length];
        for(int i=gas.length-1;i>=0;i--){
            array[i]=gas[i]-cost[i];
        }
        for(int i=0;i<gas.length;i++){
            int index=i;
            int result=0;
            for(int j=0;j<gas.length+1;j++){
                result+=array[index];
                if(result<0) break;
                index++;
                if(index==gas.length) index=0;
                if(index==i) return i;
            }
        }
        return -1;
    }
}