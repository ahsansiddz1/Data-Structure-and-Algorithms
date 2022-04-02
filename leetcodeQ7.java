
    package data.structure;
    import java.util.Arrays;


class leetcodeQ7 {
    int val;
    leetcodeQ7 next;

    public leetcodeQ7(){}
    public leetcodeQ7(int val)
    {
        this.val=val;
    }
    public leetcodeQ7(int val,leetcodeQ7 next)
    {
        this.val=val;
        this.next=next;
    }

    public static void main(String args[])
    {
        System.out.println();

        MergeSortA list=new MergeSortA();

        list.insertLast(95);
        list.insertLast(34);
        list.insertLast(32);
        list.insertLast(24);
        list.insertLast(44);
        list.insertLast(54);
        System.out.println("Before Sorting");
        list.display();
        MergeSortA m = new MergeSortA();
        leetcodeQ7 a = list.sortList(list.head);
        m.head=a;
        System.out.println("After Sorting ");
        m.display();
    }

}

  class MergeSortA{

      leetcodeQ7 head;
      leetcodeQ7 tail;
      private int size;

      public MergeSortA() {
          this.size = 0;
      }

      public void insertFirst(int val) {
          leetcodeQ7 node = new leetcodeQ7(val);
          node.next = head;
          head = node;

          if (tail == null) {
              tail = head;
          }
          size += 1;
      }

      public void insertLast(int val) {
          leetcodeQ7 node = new leetcodeQ7(val);
          if (tail == null) {
              insertFirst(val);
              return;
          }
          tail.next = node;
          tail = node;
          size += 1;
      }
      public void display() {
          leetcodeQ7 temp = head;
          while (temp != null) {
              System.out.print(temp.val + "->");
              temp = temp.next;
          }
          if (head != null) {
              System.out.println("end");

          }
      }
 
    public leetcodeQ7 sortList(leetcodeQ7 head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        leetcodeQ7 mid=getmid(head);
        leetcodeQ7 left=sortList(head);
        leetcodeQ7 right=sortList(mid);
         return merge(left,right);

    }

    leetcodeQ7 merge(leetcodeQ7 list1, leetcodeQ7 list2)
    {
        leetcodeQ7 dummyHead=new leetcodeQ7();
        leetcodeQ7 tail=dummyHead;

        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next= (list1!=null)? list1 : list2;

         return dummyHead.next;

    }

    leetcodeQ7 getmid(leetcodeQ7 head)
    {
        leetcodeQ7 midprev=null;
        while (head!=null && head.next!=null)
        {
            midprev=(midprev==null) ? head : midprev.next;
            head=head.next.next;
        }
        leetcodeQ7 mid=midprev.next;
        midprev.next=null;
        return mid;

    }

        }
 
//Merge Sort Algo 1
//public class leetcodeQ7 {
//    public static void main(String[] args) {
//    int[] arr=  {2,4,6,9,5,6,3,8};
//      arr= mergeSort(arr);
//       System.out.println(Arrays.toString(arr));
//    }
//
//
//        public static int[] mergeSort(int arr[]){
//
//            if(arr.length==1)
//            {
//                return arr;
//            }
//            int mid=arr.length/2;
//            int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
//             int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
//             return merge(left,right);
//        }
//
//        static int[] merge(int[] first, int[] second) {
//
//            int[] mix=new int[first.length+second.length];
//            int i=0;
//            int j=0;
//            int k=0;
//            while(i<first.length && j<second.length)
//            {
//                if(first[i]<second[j])
//                {
//                     mix[k]=first[i];
//                     i++;
//                }
//                else{
//
//                    mix[k]=second[j];
//
//                    j++;
//                }
//                k++;
//            }
//            while(i<first.length)
//            {
//                mix[k]=first[i];
//                i++;
//                k++;
//            }
//            while(j<second.length)
//            {
//                mix[k]=second[j];
//                j++;
//                k++;
//            }
//
//            return mix ;
//        }
//    }

//Merge Sort Algo 2ND WAY - USING RECURSION
//
//public class leetcodeQ7 {
//    public static void main(String[] args) {
//        int[] arr=  {2,4,6,9,5,6,3,8};
//          mergeSort(arr,0,arr.length);
//         System.out.println(Arrays.toString(arr));
//    }
//
//
//
//    public static void mergeSort(int arr[],int s,int e)
//    {
//
//        if(e-s==1)
//        {
//            return  ;
//        }
//        int m=(s+e)/2; // s+(e-s)/2 <-More Efficient
//
//        mergeSort(arr,s,m);
//        mergeSort(arr,m,e);
//         merge(arr,s,m,e);
//    }
//
//    static void merge(int[] arr, int s,int m , int e) {
//  int[] mix=new int[e-s];
//
//        int i=s;
//        int j=m;
//        int k=0;
//        while(i<m && j<e)
//        {
//            if(arr[i]<arr[j])
//            {
//                mix[k]=arr[i];
//                i++;
//
//            }
//            else{
//
//                mix[k]=arr[j];
//
//                j++;
//
//            }
//            k++;
//        }
//        while(i<m)
//        {
//            mix[k]=arr[i];
//            i++;
//            k++;
//        }
//        while(j<e)
//        {
//            mix[k]=arr[j];
//            j++;
//            k++;
//        }
//
//       for(  int l=0; l<mix.length; l++)
//       {
//            arr[s+l]=mix[l];
//       }
//    }
//}
