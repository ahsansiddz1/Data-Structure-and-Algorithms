import java.util.ArrayList;
import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1/?page=1&category[]=Arrays&curated[]=1&sortBy=submissions#
public class ArrayProb3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(10);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(7);
//------------------------------------------------------------
        //Print techniques of ArrayList

        //1st method to print
        System.out.println(arr);


        //2nd method to print
//        for(int i=0; i<2; i++)
//        {
//            System.out.println(arr.get(i));
//        }

        //3rd method to print
        //System.out.println(Arrays.toString(new ArrayList[]{arr}));
//-----------------------------------------------------------------------------
reverseInGroups(arr,5,3);
        System.out.println(arr);
    }
   static  void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here

        if(arr.isEmpty())return; //edge case

       int i=0;
        while(i<n){    //[1,3,4,5,6]
            if(i+k<n){ // 0+3< 5  == 2 < 4
                reverse(arr,i,i+k-1);
            }
            else{
                reverse(arr,i,n-1);
            }
            i = i + k;
        }
    }

    static void reverse(ArrayList<Integer> arr, int a, int b){
        while(a<b){
            int swap = arr.get(a);
            arr.set(a,arr.get(b));
            arr.set(b,swap);
            a++;
            b--;
        }
    }
}
