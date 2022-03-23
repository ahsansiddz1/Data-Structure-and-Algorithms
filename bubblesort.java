package data.structure;

public class bubblesort {

    public static void main(String[] args) {

 int temp;
         int a[]={2,4,1,0,33,3,123,23,1,15};

         for(int i=0; i<a.length-1; i++)
         {
             for(int j=0; j<a.length-(i+1); j++)
             {
                 if(a[j]>a[j+1])
                 {
                     temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
         }

         for(int k=0; k<a.length; k++)
         {
             System.out.print(a[k]+" ");
         }
    }
}