public class Q79WordSearch {
    public boolean exist(char[][] board, String word) {
        if(word.length()==0) return true;
        char c=word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                boolean[][] b=new boolean[board.length][board[i].length];
                if (ref(board,word,i,j,b)) return true;
            }
        }
        return false;
    }

    public boolean ref(char[][] board, String word,int r,int c,boolean[][] d){
        boolean result=false;
        if(word.charAt(0) != board[r][c] ||d[r][c]) return result;
        d[r][c]=true;
        word=word.substring(1,word.length());
        if("".equals(word)||word.length()==0){
            result=true;
            return result;
        }
        if(r!=0) result= result || ref(board,word,r-1,c,d);
        if(r!=board.length-1) result= result || ref(board,word,r+1,c,d);
        if(c!=0) result= result || ref(board,word,r,c-1,d);
        if(c!=board[r].length-1) result= result || ref(board,word,r,c+1,d);
        d[r][c]=false;
        return result;
    }
}
