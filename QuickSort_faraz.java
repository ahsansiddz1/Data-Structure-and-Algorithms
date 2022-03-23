package data.structure.data.structure;
import java.util.Arrays;

public class QuickSort_faraz
{
    public static void quickSort(int[] arr, int start, int end,  char order){
        int pIndex;
        if(start < end){
            pIndex = partition(arr,start,end, order);
            quickSort(arr, start, pIndex -1 , order);
            quickSort(arr, pIndex + 1, end, order);
        }
    }
    public static int partition(int[] arr, int start, int end, char order){
        int pIndex = start;
        int temp = arr[end];
        int aux;
        for(int i = start; i < end; i++){
            if(order == 'a') {
                if (arr[i] <= temp) {
                    aux = arr[i];
                    arr[i] = arr[pIndex];
                    arr[pIndex] = aux;
                    pIndex++;
                }
            }
            else{
                if (arr[i] >= temp) {
                    aux = arr[i];
                    arr[i] = arr[pIndex];
                    arr[pIndex] = aux;
                    pIndex++;
                }
            }
        }
        aux = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = aux;
        return pIndex;
    }
    public static void main(String[] args) {

        int[] arr = {3,4,1,8,6,5,0,2,7,13,15,18,19,10,9,11,14,20,16,12,17,20,28,23,21,30,22,26,25,27,29,24};
        int[] test = Arrays.copyOf(arr, arr.length);
        long init = System.nanoTime();



        init = System.nanoTime();
        quickSort(test, 0 , test.length-1, 'd');
        System.out.println("Total time taken by QuickSort is " + (System.nanoTime() - init) + " nano secs" );

        for(int i : test){
            System.out.println(i + " ");
        }

        //According to output we found that InsertionSort is faster
        //1. Insertion sort
        //2. Quick Sort
        //3. Bubble Sort
        //4. Merge Sort
        // While we studied that merge sort is better because in the code it is using
        //implicit for loop in creating copy of another array
    }
}
