package data.structure;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {2, 32, 4, 54, 6, 3, 23, 1};

        int temp, j;
        for (int i = 1; i < a.length; i++)
        {
            temp = a[i];
            j = i-1;

            while (j != -1 && a[j] < temp)
            {
               a[j+1]=a[j];
               j--;
            }
           a[j+1]=temp;
        }
        for(int k=0; k<a.length; k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
