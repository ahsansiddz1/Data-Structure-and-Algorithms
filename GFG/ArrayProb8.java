import java.util.ArrayList;
import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/0/?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
public class ArrayProb8 {
    public static void main(String[] args) {
        int[] arr={3,34,23,24,2,1,0,12};

        ArrayList<Integer> a= subarraySum(  arr,   arr.length,   81);
        System.out.println(a);

    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        ArrayList<Integer> num = new ArrayList<Integer>();

        int sum = 0, start = 0;
        int i=0;
        while(i<n)
        {
            sum = sum+arr[i];
            //System.out.println(sum);
            while(sum>s&&start<n)
            {
                sum = sum-arr[start];
                start++;
            }

            if(sum==s)
            {
                num.add(start+1);
                num.add(i+1);
                return num;
            }
            i++;
        }

        num.add(-1);
        return num;
    }
}


