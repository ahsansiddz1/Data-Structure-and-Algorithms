package data.structure;
import java.util.Arrays;
public class Sortingsprog {
    public static int[] bubbleSort(int[] a, char order) {
        int temp;
        boolean issorted=false; //making bubble sort algorith adaptive
        // we use this for check if we have the array which is already sorted then only
          // one pass will be run and the it returns the array to main method
        //or when the array becomes sorted before (n-1 passes) then its  returns the array to main method

        for (int i = 0; i < a.length - 1; i++) {  //for number of pass
            issorted=true;
       //     System.out.println("Working on pass : "+i );
            for (int j = 0; j < a.length - 1-i; j++) { ////for number of comparisions in each pass
                if (order == 'a') {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        issorted=false;

                    }
                } else if (order == 'd') {
                    if (a[j] < a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        issorted=false;

                    }
                } else {
                    System.out.println("please enter 'a' or 'd' in bubble sorting algorithm");
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exit(0);
                }
            }
            if(issorted)    // this if block runs when array is already sorted in ascending or descendind order
            {
                return a;
            }
        }
        return a;
    }

    //-------------------------------------------------End of Bubble Sort Algorithm----------------------------------------
    public static int[] SelectionSort(int[] a, char order) {
        int min, temp;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (order == 'a') {
                    if (a[j] < a[min]) {
                        min = j;
                    }
                }
                if (order == 'd') {
                    if (a[j] < a[min]) {
                        min = j;
                    }
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
//-------------------------------------------------End of Selection Sort Algorithm----------------------------------------

    public static int[] insertionSort(int[] arr, char order) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int count = i - 1;
            if (order == 'a') {
                while (count != -1 && temp < arr[count]) {
                    arr[count + 1] = arr[count];
                    count--;
                }
            } else {
                while (count != -1 && temp > arr[count]) {
                    arr[count + 1] = arr[count];
                    count--;
                }
            }
            arr[++count] = temp;
        }
        return arr;
    }


    //-------------------------------------------------End of Selection Sort Algorithm----------------------------------------
    public static int[] mergeSort(int[] arr, char order) {
        int length = arr.length;

        if (length < 2) return arr;

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
        right = mergeSort(right, order);
        return merge(left, right, arr, order);
    }

    public static int[] merge(int[] L, int[] R, int[] arr, char order) {
        int LPoint = 0, RPoint = 0, point = 0;
        while (LPoint < L.length && RPoint < R.length) {
            if (order == 'a') {
                if (L[LPoint] < R[RPoint]) {
                    arr[point++] = L[LPoint++];
                } else {
                    arr[point++] = R[RPoint++];
                }
            } else {
                if (L[LPoint] > R[RPoint]) {
                    arr[point++] = L[LPoint++];
                } else {
                    arr[point++] = R[RPoint++];
                }
            }
        }
        while (LPoint < L.length) {
            arr[point++] = L[LPoint++];
        }
        while (RPoint < R.length) {
            arr[point++] = R[RPoint++];
        }
        return arr;
    }
    //-------------------------------------------------End of Merge Sort Algorithm----------------------------------------

    public static int partition(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        int temp;
        do {
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        } while (i < j);
        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }

    public static void quicksort(int a[], int low, int high) {
        int partitionIndex;
        if (low < high) {
            partitionIndex = partition(a, low, high);
            quicksort(a, 0, partitionIndex - 1);
            quicksort(a, partitionIndex + 1, high);
        }
    }


        //-------------------------------------------------End of Quick Sort Algorithm----------------------------------------

        //------------------------------------------------------------------------------------------
        //-----------------------------           Main Method           ----------------------
        //------------------------------------------------------------------------------------------

        public static void main (String[]args){

          //  int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16};
            int[] arr = {3, 4, 1, 8, 6, 5, 0, 2, 7, 13, 15, 18, 19, 10, 9, 11, 14, 20, 16, 12, 17, 20, 28, 23, 21, 30, 22, 26, 25, 27, 29, 24};
            int[] test = Arrays.copyOf(arr, arr.length);
            long init = System.nanoTime();

            //------------------------------------------Bubble Sort------------------------------------------------------------------
            bubbleSort(test, 'a');  //d for descending and a for ascending
            System.out.println("\n===========================****************======================================");
            System.out.println("Result After Soring : ");

            for (int i : test) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("===***===> Total time taken by BubbleSort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");

            System.out.println("===========================****************======================================");

            //------------------------------------------Selection Sort------------------------------------------------------------------
            init = System.nanoTime();
            SelectionSort(test, 'd');  //d for descending and a for ascending
            System.out.println("\n===========================****************======================================");
            System.out.println("Result After Soring : ");

            for (int i : test) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("===***===> Total time taken by SelectionSort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");

            System.out.println("===========================****************======================================");

            //------------------------------------------Insertion  Sort------------------------------------------------------------------
            init = System.nanoTime();
            insertionSort(test, 'd');  //d for descending and a for ascending
            System.out.println("\n===========================****************======================================");
            System.out.println("Result After Soring : ");

            for (int i : test) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("===***===> Total time taken by Insertion Sort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");

            //------------------------------------------Merge  Sort------------------------------------------------------------------
            init = System.nanoTime();
            mergeSort(test, 'd');  //d for descending and a for ascending
            System.out.println("\n===========================****************======================================");
            System.out.println("Result After Soring : ");

            for (int i : test) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("===***===> Total time taken by Merge Sort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");

            //------------------------------------------Quick  Sort------------------------------------------------------------------
            init = System.nanoTime();
            mergeSort(test, 'd');  //d for descending and a for ascending
            System.out.println("\n===========================****************======================================");
            System.out.println("Result After Soring : ");

            for (int i : test) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("===***===> Total time taken by Quick Sort is " + (System.nanoTime() - init) + " nano secs " + "<===***===");


            //According to output we found that SelectionSort is faster
            //1. Insertion sort
            //2. Quick Sort
            //3. Bubble Sort
            //4. Merge Sort
            // While we studied that merge sort is better because in the code it is using
            //implicit for loop in creating copy of another array
        }
    }

