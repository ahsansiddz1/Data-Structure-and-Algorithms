package data.structure.data.structure;
import java.util.Arrays;
public class mergeSort_faraz {
    public static int[] mergeSort(int[] arr , char order){
        int length = arr.length;

      if(length < 2) return arr;

        int mid = length / 2;
        //Creating Sub arrays
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = mid; j < length; j++) {
            right[j - mid] = arr[j];
        }
        left = mergeSort(left, order);
        right = mergeSort(right,order);
        return merge(left, right, arr, order);
    }
    public static int[] merge(int[] L, int[] R, int[] arr, char order){
        int LPoint = 0, RPoint = 0, point = 0;
        while(LPoint < L.length && RPoint < R.length){
            if(order ==  'a') {
                if (L[LPoint] < R[RPoint]) {
                    arr[point++] = L[LPoint++];
                } else {
                    arr[point++] = R[RPoint++];
                }
            }
            else{
                if (L[LPoint] > R[RPoint]) {
                    arr[point++] = L[LPoint++];
                } else {
                    arr[point++] = R[RPoint++];
                }
            }
        }
        while(LPoint < L.length ){
            arr[point++] = L[LPoint++];
        }
        while(RPoint < R.length ){
            arr[point++] = R[RPoint++];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,8,6,5,0,2,7,13,15,18,19,10,9,11,14,20,16,12,17,20,28,23,21,30,22,26,25,27,29,24};
        int[] test = Arrays.copyOf(arr, arr.length);
        long init = System.nanoTime();
        init = System.nanoTime();
        mergeSort(test, 'd');
        System.out.println("Total time taken by MergeSort is " + (System.nanoTime() - init) + " nano secs" );
        for(int i:test)
        {
            System.out.print(i+" ");
        }
    }
}
