package data.structure;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2, 3, 7, 42, 52, 4, 14, 61, 135};
        int low = 0, high = a.length - 1;

        MergeSort ms = new MergeSort(); //creating obj

        ms.printarr( a,low, high);
        ms.mergesort(a, low, high); //calling sort method
       ms.printarr( a,low, high);

    }

    public void merge(int a[], int mid, int low, int high) {
        int size = a.length;
        int i, j, k;
        int b[] = new int[size];
        i = low;
        j = mid + 1;
        k = low;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }

        }

        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        while (j <= high) {
            b[k] = a[j];
            j++;
            k++;
        }
        for (i = low; i < high; i++) {

           a[i]=b[i];

        }
    }


    public void mergesort(int a[], int low, int high)
    {
        int mid;
        if (low < high)
            {
                  mid = (low + high) / 2;
                  mergesort(a,low,mid);
            mergesort(a,mid+1,high);
                merge(a,mid,low,high);
            }

    }
    public void printarr(int a[],int low,int high)
    {
        System.out.println();
        for(int i=low; i<=high; i++)
        {

            System.out.print(a[i]+" ");
        }
    }
}
