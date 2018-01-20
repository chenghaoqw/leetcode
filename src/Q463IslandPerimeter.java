import java.util.HashMap;

public class Q463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        int land=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    land++;
                    if(map.containsKey(i+"&"+j+"&"+"0")) count++;
                    else map.put(i+"&"+j+"&"+"0",1);
                    if(map.containsKey(i+"&"+j+"&"+"1")) count++;
                    else map.put(i+"&"+j+"&"+"1",1);
                    if(map.containsKey((i+1)+"&"+j+"&"+"0")) count++;
                    else map.put((i+1)+"&"+j+"&"+"0",1);
                    if(map.containsKey(i+"&"+(j+1)+"&"+"1")) count++;
                    else map.put(i+"&"+(j+1)+"&"+"1",1);
                }
            }
        }
        return 4*land-count*2;
    }
}
