import java.util.Random;

public class MergeAndQuickSort {
    //Merge Sort
    // Total Time Complexity = O(nlogn)
    //worst time complexity = nlogn

//    public static void conquer(int[] arr, int si,int mid, int ei)
//    {
//        //TIME COMPLEXITY = O(n)
//        int[] merged=new int[ei-si+1];
//
//        int idx1=si;
//        int idx2=mid+1;
//        int x=0;
//        while(idx1<=mid && idx2<=ei )
//        {
//            if(arr[idx1]>=arr[idx2])
//            {
//                merged[x++]=arr[idx2++];
//            }
//            else {
//                merged[x++]=arr[idx1++];
//            }
//        }
//        while (idx1<=mid)
//        {
//            merged[x++]=arr[idx1++];
//        }
//        while (idx2<=ei)
//        {
//            merged[x++]=arr[idx2++];
//        }
//        for(int i=0,j=si; i<merged.length; i++,j++)
//        {
//            arr[j]=merged[i];
//        }
//
//    }
//    public static void divide(int[] arr, int si,int ei)
//    {
//        //TIME COMPLEXITY = Olog(n)
//        if(si>=ei)
//        {
//            return;
//        }
//        int  mid=si+(ei-si)/2;
//        divide(arr,si,mid);
//        divide(arr,mid+1,ei);
//        conquer(arr,si,mid,ei);//calling conquer method to sort and merge the array element again.
//    }
//
//    public static void main(String[] args) {
//        int[] arr=new int[100];
//        //Array input
//        Random random = new Random();
//        for(int i=0; i<100; i++)
//        {
//            arr[i]=   random.nextInt(50);
//        }
//        int n=arr.length; //array length
//
//        divide(arr,0,n-1); //calling method to divide array until single element
//
//        for(int i=0; i<arr.length; i++) //displaying sorted array
//        {
//            System.out.print(arr[i]+" ");
//        }
//
//    }

    //Quick Sort
    //worst case : n^2
    //average: nlogn

    //important note
    //worst case occurs in quick sort if pivot element is the smallest or largest element in an array as compare to other elements
    //when it occurs?
    //it occurs if array is in increasing or in decreasing order.

    public static int pivotFind(int [] arr, int low,int high)
    {
        int pivot=arr[high];

        int i=low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i; //pivot index

    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivot=pivotFind(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        int [] arr={4,2,0,12,2,9};
        int n=arr.length;
        quickSort(arr,0,n-1);

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
