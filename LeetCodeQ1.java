package data.structure;

// Problem : Remove the duplicate elements from the list.
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class LeetCodeQ1 {


    private Nodet head;
    private Nodet tail;
    private int size;

    public LeetCodeQ1() {
        this.size = 0;
    }

    public void insertFirst(int value)
    {
        Nodet node = new Nodet(value);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }



    public void deleteDuplicate( )
    {
        Nodet list2=head;

        if(head.next==null || head==null )
        {
            return ;
        }

        else{


            while(list2.next!=null)
              {
                if(list2.value==list2.next.value)
                {
                list2.next=list2.next.next;
                 size--;
                }
                else{
                    list2=list2.next;

                }

            }
        tail=list2;
        tail.next=null;

         }
   }

    public void display()
    {
         Nodet temp=head;

        if(head==null)
        {
            System.out.println("[ list is empty ]");
        }
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        if(head!=null)
        {
            System.out.print("END");
        }
    }


}

    //---------------------------------------------------------------------------------------------------------------------------------
    //  MAIN FUNCTION CLASS
    //---------------------------------------------------------------------------------------------------------------------------------
      class Nodet{

        int value;
        Nodet next;

        public Nodet(int value)
        {
            this.value=value;
        }
        public Nodet(int value,  Nodet next)
        {
            this.value=value;
            this.next=next;
        }

    public static void main(String args[])
    {
        System.out.println();

        LeetCodeQ1 list=new LeetCodeQ1();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.display();
        System.out.println();
        list.deleteDuplicate();
        list.display();

    }

}

