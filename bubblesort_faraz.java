package data.structure.data.structure;

 import java.util.Arrays;

public class  bubblesort_faraz  {

    public static int[] bubbleSort(int[] a, char order){
        int temp;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - (i + 1); j++){
                if(order == 'a') {  //4130
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
                else  if(order == 'd') {
                    if (a[j] < a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
                else{
                    System.out.println("please enter 'a' or 'd' in bubble sorting algorithm");
                    Runtime runtime=Runtime.getRuntime();
                    runtime.exit(0);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int[] arr = {3,4,1,8,6,5,0,2,7,13,15,18,19,10,9,11,14,20,16,12,17,20,28,23,21,30,22,26,25,27,29,24};
        int[] test = Arrays.copyOf(arr, arr.length);
        long init = System.nanoTime();

        bubbleSort(test, 'd');  //d for descending and a for ascending
        System.out.println("Total time taken by BubbleSort is " + (System.nanoTime()-init ) + " nano secs" );
        for(int i : test){
            System.out.println(i + "  ");
        }


    }
}

