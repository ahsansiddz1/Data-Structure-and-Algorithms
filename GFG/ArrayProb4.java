import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/?page=1&category[]=Arrays&curated[]=1&sortBy=submissions#

//public class ArrayProb4 {
//    public static void main(String[] args) {
//    long[] A ={1,4,2,1,0};
//    long[] B={2,4,1,1,0};
//
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//
//        System.out.println(check(  A ,B, A.length));
//
//
//    }
//      static boolean check(long A[],long B[],int N)
//    {
//        sort(A);
//        sort(B);
//         for(int i=0; i<A.length; i++)
//         {
//             if(A[i]!=B[i])
//             {
//                 return false;
//             }
//         }
//         return true;
//    }
//    static void sort(long[] arr)
//    {
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=i+1; j<arr.length; j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    long temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//    }
//}



// Optimized Code


class ArrayProb4{
    //Function to check if two arrays are equal or not.

    public static void main(String[] args) {
        long[] A ={1,4,2,1,0};
        long[] B={2,4,1,1,0};


        System.out.println(check(  A ,B, A.length));
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


    }
    public static boolean check(long A[],long B[],int N)
    {
        long temp=0;
        int count=0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=B[i])
            {
                return false;
            }
        }

        return true;
    }
}

