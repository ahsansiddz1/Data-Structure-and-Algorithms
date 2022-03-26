package data.structure;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class LeetCodeQ2 {

    NODEJ head;
    NODEJ tail;

    public LeetCodeQ2() {
    }

    public static LeetCodeQ2 merge(LeetCodeQ2 first, LeetCodeQ2 second) {
        NODEJ f = first.head;
         NODEJ s = second.head;


        LeetCodeQ2 ans = new LeetCodeQ2();

        while (f != null && s != null) {

            if (f.value < s.value) {
                 ans.insertLast(f.value);
                f = f.next;
            }
            else  {
                 ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);

            f=f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);

            s=s.next;
        }
         return ans;
    }

    public void insertFirst(int val) {
        NODEJ node = new NODEJ(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
     }
    public void insertLast(int val) {
     NODEJ node = new NODEJ(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
     }


    public void display(  ){
         NODEJ temp=  head;
          while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        if(head!=null)
        {
            System.out.println("end");

        }
    }


}



class NODEJ {
      int value;
      NODEJ next;

    public NODEJ(int value){this.value=value;}
    public NODEJ(int value,NODEJ next){this.value=value; this.next=next;}

    public static void main(String[] args) {
        LeetCodeQ2 first=new LeetCodeQ2();
        LeetCodeQ2 second=new LeetCodeQ2();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);

        LeetCodeQ2 ms=  LeetCodeQ2.merge(first,second);
         ms.display(  ); // 3 2 1 4 3 1

    }
}
