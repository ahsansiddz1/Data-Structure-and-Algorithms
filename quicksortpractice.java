package data.structure.data.structure;

import java.util.Arrays;

public class quicksortpractice {

    public static void printarr(int a[],int n)
    {
        for(int i=0; i<n; i++)
        {
              System.out.print(a[i] +" ");
        }
    }

    public static int partition(int a[],int low,int high)
    {
        int pivot=a[low];
        int i=low+1;
        int j=high;
        int temp;
        do
        {
            while(a[i]<=pivot)
            {
                i++;
            }
            while(a[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }while(i<j);
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void quicksort(int a[],int low,int high)
    {
        int partitionIndex;
        if(low<high)
        {
            partitionIndex=partition(a,low,high);
            quicksort(a,0,partitionIndex-1);
            quicksort(a,partitionIndex+1,high);
        }
    }

    //main method
    public static void main(String[] args)
    {

        int[] arr = {3,4,1,8,6,5,0,2,7,13,15,18,19,10,9,11,14,20,16,12,17,20,28,23,21,30,22,26,25,27,29,24};
        int[] test = Arrays.copyOf(arr, arr.length);
        System.out.println("\n===========================****************======================================\n Before Sorting : ");

        for(int i : test)
        {
            System.out.print(i + " ");
        }

        long init = System.nanoTime();

        quicksort(test, 0 , test.length-1);
        System.out.println("\n===========================****************======================================");
        System.out.println("Result After Soring : ");

        for(int i : test)
            {
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("===***===> Total time taken by QuickSort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");

        System.out.println("\n===========================****************======================================");
        //According to output we found that InsertionSort is faster
        //1. Insertion sort
        //2. Quick Sort
        //3. Bubble Sort
        //4. Merge Sort
        // While we studied that merge sort is better because in the code it is using
        //implicit for loop in creating copy of another array
    }
}
