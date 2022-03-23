package data.structure;
import javax.management.remote.JMXServerErrorException;
import java.util.Arrays;
public class insertionsort_faraz {
    public static int[] insertionSort(int[] arr, char order){
        int temp;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            int count = i - 1;
            if(order == 'a') {
                while (count != -1 && temp < arr[count]) {
                    arr[count + 1] = arr[count];
                    count--;
                }
            }
            else{
                while (count != -1 && temp > arr[count]) {
                    arr[count + 1] = arr[count];
                    count--;
                }
            }
            arr[++count] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {3,4,1,8,6,5,0,2,7,13,15,18,19,10,9,11,14,20,16,12,17,20,28,23,21,30,22,26,25,27,29,24};
        int[] test = Arrays.copyOf(arr, arr.length);
        long init = System.nanoTime();



        init = System.nanoTime();
        insertionSort(test, 'd');
        System.out.println("Total time taken by InsertionSort is " + (System.nanoTime() - init) + " nano secs" );
        for(int i : test){
            System.out.println(i + " ");
        }


    }
}
