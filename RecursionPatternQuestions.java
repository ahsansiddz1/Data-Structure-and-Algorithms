//package data.structure;
//
//public class RecursionPatternQuestions {
//    public static void main(String[] args) {
//        triangle(4,0);
//    }
//
//    static void triangle(int row,int col)
//    {
//        if(row==0)
//        {
//            return;
//        }
//        if( col<=row-col) //col=0 row=4
//        {
//            System.out.print("*");
//            triangle(row,col+1);
//        }
//        else{
//            System.out.println();
//            triangle(row-1,0);
//        }
//    }
//}
//  Reverse triangle pattern
//package data.structure;
//
//public class RecursionPatternQuestions {
//    public static void main(String[] args) {
//        triangle(4,0);
//    }
//
//    static void triangle(int row,int col)
//    {
//        if(row==0)
//        {
//            return;
//        }
//        if( col<row) //col=0 row=4
//        {
//             triangle(row,col+1);
//             System.out.print("*");
//
//        }
//        else{
 //            triangle(row-1,0);
//            System.out.println();
//
//        }
//    }
//}

// 4 1 // 4 2 // 4 3 // 4 4
//3 1 // 3 2 //3 3
//2 1 //2 2 //
//1 1


//-----------------------------------------------------------------------------------------------
//Bubble sort using recursion
//----------------------------------------------------------------------------------------------
package data.structure;

import java.util.Arrays;

public class RecursionPatternQuestions {
    public static void main(String[] args) {
        int[] arr={3,2,5,2,6,1};


        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr) + " ");

    }

    static void bubblesort(int[] arr,int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if( col<row)
        {

            if(arr[col]<arr[col+1])
            {
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1 ]=temp;
                bubblesort(arr,row,col+1);

            }
            else{
                  bubblesort(arr,row,col+1);
            }

        }
        else{


            bubblesort(arr,row-1,0);


        }
    }
}

//-----------------------------------------------------------------------------------------------
//Selection sort using recursion
//----------------------------------------------------------------------------------------------
//package data.structure;
//
//import java.util.Arrays;
//
//public class RecursionPatternQuestions {
//    public static void main(String[] args) {
//        int[] arr={3,2,5,2,6,1};
//
//        selectionsort(arr,arr.length ,0,0);
//        System.out.println(Arrays.toString(arr) + " ");
//
//    }
//
//    static void selectionsort(int[] arr,int row,int col,int max)
//    {
//        if(row==0)
//        {
//            return;
//        }
//        if( col<row)
//         {
//
//             if(arr[max]<arr[col])
//             {
//
//                 selectionsort(arr,row,col+1,col );
//             }
//             else{
//                 selectionsort(arr,row,col+1,max);
//             }
//
//        }
//        else{
//            int temp=arr[max];
//            arr[max]=arr[row-1];
//            arr[row-1 ]=temp;
//
//           selectionsort(arr,row-1,0,0);
//
//
//        }
//    }
//}