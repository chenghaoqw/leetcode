public class Q794ValidTicTacToeState {
    public boolean validTicTacToe(String[] board) {
        int[][] b=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char c=board[i].charAt(j);
                if(c=='X') b[i][j]=1;
                else if(c=='O') b[i][j]=-1;
            }
        }
        int c1=0,c0=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b[i][j]==-1) c0++;
                else if(b[i][j]==1) c1++;
            }
        }
        int cr0=0,cc0=0,cd0=0,cr1=0,cc1=0,cd1=0;
        for(int i=0;i<3;i++){
            if(b[i][0]==b[i][1] && b[i][1]==b[i][2])
                if(b[i][0]==-1) cr0++;
                else if(b[i][0]==1) cr1++;
        }
        for(int i=0;i<3;i++){
            if(b[0][i]==b[1][i] && b[1][i]==b[2][i])
                if(b[0][i]==-1) cc0++;
                else if(b[0][i]==1)cc1++;
        }
        if(b[0][0]==b[1][1] && b[1][1]==b[2][2])
            if(b[0][0]==-1) cd0++;
            else if(b[0][0]==1) cd1++;
        if(b[2][0]==b[1][1] && b[1][1]==b[0][2])
            if(b[2][0]==-1) cd0++;
            else if(b[2][0]==1) cd1++;
        if(cr0 >1 || cr1>1 || cc0 >1 || cc1 >1) return false;
        if((cr0 > 0 || cc0 >0 || cd0 >0) &&(cr1>0 || cc1 >0 || cd1 >0)) return false;
        if(cr0 > 0 || cc0 >0 || cd0 >0) return c1==c0;
        if(cr1>0 || cc1 >0 || cd1 >0) return c1==c0+1;
        return (c0==c1 || c1==c0+1) && c0+c1<=9;
    }
}
