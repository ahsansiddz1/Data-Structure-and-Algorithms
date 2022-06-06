import java.util.Arrays;
//link: https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
public class ArrayProb1 {
    public static void main(String[] args) {

        int arr[] = {-8, 4, 2, 4, -2, 0};
        System.out.println(findTriplets(arr,arr.length));
    }

    public static boolean findTriplets(int arr[], int n) {
       int sum=0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                      sum += arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        return true;
                    }
                    sum=0;
                }
            }
        }
        return false;
    }
}
//For Understanding
//example [1,2,3,4]
//        indexes:
//        i j k
//        0+1+2
//        0+1+3
//        0+2+3
//        1+2+3
//
//        i=0 i<n-2;
//        j=i+1; i<n-1;
//        k=j+1; k<n;

