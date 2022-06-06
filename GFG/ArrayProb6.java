import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/0/?page=1&category[]=Arrays&curated[]=1&sortBy=submissions#
public class ArrayProb6 {
    public static void main(String[] args) {
        long[] a={6, 1, 9, 5, 4};
        long[] b={3, 4, 8, 2, 4};
        System.out.println( minValue(a,b,a.length));
    }
      static long minValue(long a[], long b[], long n)
    {
        long ans;
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            ans=a[i]*b[(int)n-1-i];
            sum+=ans;
        }
        return sum;
    }
}
