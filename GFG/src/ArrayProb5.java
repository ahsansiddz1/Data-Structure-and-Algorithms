import java.util.Arrays;

public class ArrayProb5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        zigZag(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static  void zigZag(int arr[], int n) {
        int flag=0;
        for(int i=0;i<n-1;i++){
            int min=Math.min(arr[i],arr[i+1]);
            int max=Math.max(arr[i],arr[i+1]);
            if(flag==0){
                arr[i]=min;
                arr[i+1]=max;
                flag=1;
                continue;
            }
            if(flag==1){
                arr[i]=max;
                arr[i+1]=min;
                flag=0;
                continue;
            }
        }
    }
}
