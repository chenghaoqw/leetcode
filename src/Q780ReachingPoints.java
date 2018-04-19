public class Q780ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(sx < tx && sy < ty)
            if(tx > ty) tx%=ty;
            else ty%=tx;
        if(sx==tx) return (ty-sy) %tx==0;
        if(sy==ty) return (tx-sx) %ty==0;
        return false;
    }
}
