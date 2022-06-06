//https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1/?page=1&difficulty[]=-1&category[]=Arrays&curated[]=1&sortBy=submissions
public class ArrayProb2 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 7 ,8 ,9 ,11, 12, 14, 15, 19, 20, 22, 25, 26, 28, 32, 33, 35, 36, 37, 38, 41, 43, 44, 45,
                         46, 49, 50, 51, 52, 53 ,55 ,59 ,60 ,61
                        ,62 ,65 ,66, 67, 69, 70 ,71 ,72, 73, 74, 75
                        ,76, 77, 78, 79, 80, 81, 82, 83, 84, 88 ,92, 93
                        ,94 ,95 ,96 ,98 ,99,  222};

        System.out.println( binarysearch(arr,arr.length,65));
    }


    static int binarysearch(int arr[], int n, int k) {

        int start=0;
        int end=n-1;

        //edge cases
        if(arr.length==0)
        {
            return -1;
        }
        if(k==arr[start])
        {
            return start;
        }
        if(k==arr[end])
        {
            return end;
        }


        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid]==k)
                return mid;

            if(arr[mid]<k)
            {
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}