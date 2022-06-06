import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/0/?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
//some test cases not passed
public class ArrayProb7 {
    public static void main(String[] args) {
        int[] a={6, 3,3,5,5};


        System.out.println( firstElementKTime(a,a.length,2));
    }
    public static int firstElementKTime(int[] a, int n, int k) {
     int tempsize=0;
        Arrays.sort(a);
//        int count =0;
        int i=0;
        int temp=-1;
        //-------------------------
        //edge cases
        if(n==0) //if array size is zero or array doesn't contains any element
        {
            return -1;
        }
        if(n==1 && k==1)  //if the array contains only one element and k is also 1
        {
            return a[0];
        }
        //--------------------------
        while(tempsize!=n*n) {
            int count=1;

               for(int j=i+1; j<n; j++)
               {

                   if(a[i]==a[j])
                   {
                       count++;
                   }
                   if(count==k)
                   {
                       return a[i];

                   }

           }
            i++;
            count=0;
            tempsize++;

        }
        return -1;
    }
}
