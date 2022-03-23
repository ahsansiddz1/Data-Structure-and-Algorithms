package data.structure;

public class SelectionSort {
    public static void main(String[] args)
    {
        int a[]={1,3,4,5,2,4,5,6,67,8};
        int min,temp;
        for(int i=0; i<a.length; i++)
        {
            min=i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
             temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        for(int k=0; k<a.length; k++)
        {
            System.out.print(a[k]+" ");
        }

    }
}
