public class sudoku {

    public static boolean isSafe(char[][] board,int row,int col,int number)  {

        //row and col
        for(int i=0; i<board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }
        for(int j=0; j<board.length; j++) {
            if(board[row][j]==(char)(number+'0'))
            {
                return false;
            }
        }


        //grid
        int startrow= (row/3)*3;
        int startcol= (col/3)*3;

        for(int i=startrow; i<startrow+3; i++)
        {
            for(int j=startcol; j<startcol+3; j++)
            {
                if(board[i][j]==(char)(number+'0'))
                {
                    return false;
                }

            }
        }
        return true;



    }


    public static boolean helper(char[][] board,int row,int col)
    {
        int nrow=0;
        int ncol=0;

        if(row==board.length)
        {
            return true;
        }

        if(col!=board.length-1)
        {
            nrow=row;
            ncol=col+1;
        }
        else{
            nrow=row+1;
            ncol=0;
        }

        if(board[row][col]!='.')
        {
            if(helper(board,nrow,ncol))
            {
                return true;
            }
        }
        else{
            for(int i=1; i<=9; i++)
            {
                if(isSafe(board,row,col,i))
                {
                    board[row][col]=(char)(i+'0'); //type conversion from int to char
                }
                if(helper(board,nrow,ncol))
                {
                    return true;
                }
                else{
                    board[row][col]='.';
                }

            }
        }
        return false;
    }
    public static void solveSudoku(char[][] board) {
        helper(board,0,0);

    }
    public static void printboard(char[][] board) {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j< board.length; j++)
            {
                System.out.print(board[i][j]+" , ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
       char[][] board= {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','7','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','6','.','.','8','.','.','7','9'}
       };
        printboard(board);

        System.out.println("=====================================");
        solveSudoku( board);
        printboard(board);

    }
}

