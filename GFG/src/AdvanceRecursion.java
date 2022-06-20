import java.util.ArrayList;

public class AdvanceRecursion {
    // >>>>>>>>>>   permutations of string <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//      Time complexity - O(n*n!)
//       public static void printPermutation(String str,  String perm) {
//       if(str.length() == 0) {
//           System.out.println(perm);
//           return;
//       }
//       for(int i=0; i<str.length(); i++)
//       {
//           char currChar=str.charAt(i);
//           String newStr=str.substring(0,i)+str.substring(i+1);
//           printPermutation(newStr,perm+currChar);
//       }
//   }

    // >>>>>>>>>>   Maze paths count problem <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//simple way
//    public static int countPaths(int i, int j, int m, int n) {
//        if(i == m  || j == n ) {
//            return 0;
//        }
//        if(i == m-1 && j == n-1) {
//            return 1;
//        }
//         int down=countPaths(  i+1,j, m,  n);
//        int right=countPaths(  i,j+1, m, n);
//        return down +right;
//    }
    //Enhanced way
//        public static int countPaths(int i, int j, int m, int n) {
//            if(i == m-1 || j == n-1) {
//                return 1;
//            }
//
//            return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
//        }


//---------------------------------------------------------------------------------------------------------------------

    // >>>>>>>>>>   Place tiles of size 1*m in a floor of n*m   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

//     static int placeTiles(int n,int m)
//     {
//
//         //edge cases
//         if(n==m) //if n and m are same then we can places all the tiles either as horizontally or vertically.
//         {         //in this condition only cases can occur (all tiles are places horizontal or all are placed as vertical )
//             return 2;
//         }
//         if(n<m) //we can place only horizontally
//         {
//             return 1;
//         }
//         //vertically
//         int verticalPlacements=placeTiles(n-m,m);
//
//         //horizontally
//         int horizontalPlacements=placeTiles(n-1,m);
//
//         return verticalPlacements+horizontalPlacements;
//
//     }


//---------------------------------------------------------------------------------------------------------------------

    // >>>>>>>>>>   Find the number of ways in which you can invite n people to your party,single or in pairs.   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

//    static int callGuests(int n)
//    {
//        if(n<=1)
//        {
//            return 1;
//        }
//        //single
//        int ways1=callGuests(n-1);
//        //pairs
//        int ways2= (n-1)*callGuests(n-2);
//
//        return ways1+ways2;
//    }


//---------------------------------------------------------------------------------------------------------------------

    // >>>>>>>>>>   Print all the subset of first n natural number <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

//    static void printSubset(ArrayList<Integer>subset)
//    {
//        for(int i=0; i<subset.size(); i++)
//        {
//            System.out.print(subset.get(i)+" ");
//        }
//        System.out.println();
//    }
//     static void findSubsets(int n,ArrayList<Integer>subset)
//     {
//         if(n==0)
//         {
//             printSubset(subset);
//             return;
//         }
//         //will be add
//         subset.add(n);
//         findSubsets(n-1,subset);
//
//         //will not add
//         subset.remove(subset.size()-1);
//         findSubsets(n-1,subset);
//
//     }
    public static void main(String args[]) {
           //prob 1
          // String str = "abc";
          // printPermutation(str, "");

           //prob 2
//        int m = 3, n =3;
//        System.out.println(countPaths(0, 0, m, n));

           //prob 3
//        int n=4,m=2;
//        System.out.println( placeTiles(n,m));

        //prob 4
//        int n=4;
//        System.out.println(callGuests(n));

        //prob 5
//        int n=3;
//        ArrayList<Integer> subset=new ArrayList<>();
//        findSubsets(n,subset);
   }

   }
