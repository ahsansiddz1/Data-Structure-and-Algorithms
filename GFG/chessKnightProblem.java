//import java.util.*;
//public class chessKnightProblem {
//
//    /*
//     * Complete the 'knightlOnAChessboard' function below.
//     *
//     * The function is expected to return a 2D_INTEGER_ARRAY.
//     * The function accepts INTEGER n as parameter.
//     */
//    //helper
//    public static void helper(char[][] board,List<List<String>> allBoards,int col)
//    {
//        if(col== board.length)
//        {
//            saveBaord(board,allBoards);
//            return;
//        }
//        for(int row=0; row<board.length; row++)
//        {
//            if(isSafe(row,col,board))
//            {
//                board[row][col]='Q';
//                helper(board,allBoards,col+1);
//                board[row][col]='.';
//            }
//        }
//    }
//    public static List<List<Integer>> knightlOnAChessboard(int n) {
//
////list of possible condition in which each of the given n Knight are not chasing/killing to another one.
//        List<List<Integer>> allBoard=new ArrayList<>();
//        char[][] boards=new char[n][n]; //chess board size
//        helper(board,allBoards,0);
//        return allBoards;
//
//
//    }
//
//    //main method
//    public static void main(String[] args) {
//        knightlOnAChessboard(4);
//    }
//}