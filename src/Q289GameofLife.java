public class Q289GameofLife {
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int column=board[0].length;
        int[][] result=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int live=calc(board,i,j,row-1,column-1);
                if(board[i][j]==1){
                    if(live<2) board[i][j]=-1;
                    else if(live ==2 || live==3) board[i][j]=1;
                    else if(live > 3) board[i][j]=-1;
                }else{
                    if(live==3) board[i][j]=-2;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==-1) board[i][j]=0;
                else if(board[i][j]==-2) board[i][j]=1;
            }
        }
    }

    public int calc(int[][] board,int r,int c,int row,int column){
        int sum=0;
        for(int i=r-1;i<=r+1;i++){
            for(int j=c-1;j<=c+1;j++){
                if(i<0 || i>row || j<0 || j>column || (i==r && j==c)) continue;
                if(board[i][j]==1 || board[i][j]==-1) sum++;
            }
        }
        return sum;
    }
}
