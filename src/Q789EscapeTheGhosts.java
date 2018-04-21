public class Q789EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dis=Math.abs(target[0])+Math.abs(target[1]);
        for(int[] ghost:ghosts){
            if((Math.abs(ghost[0]-target[0]) + Math.abs(ghost[1]-target[1])<=dis)) return false;
        }
        return true;
    }
}
