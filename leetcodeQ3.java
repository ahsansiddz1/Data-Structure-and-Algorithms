package data.structure;
//Amazon and Microsft Questions -find the list is circular or not ?
// and find length of any type of linkedlist
//https://leetcode.com/problems/linked-list-cycle/

public class leetcodeQ3 {

    ListNodeI head;
    ListNodeI tail;
    private int size = 0;

    public leetcodeQ3() {
        this.size = 0;
    }

    public boolean hasCycle(ListNodeI head) {
            ListNodeI fast=head;
            ListNodeI slow=head;

            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
    }

    public int lengthCycle(ListNodeI head) { //length of cycle
        ListNodeI fast=head;
        ListNodeI slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNodeI temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }
                while (temp!=slow);
                return length;

             }
        }
        return 0;
    }

    public void insertFirst(int val) {
        ListNodeI node = new ListNodeI(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        ListNodeI node = new ListNodeI(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }



    public void display(  ){
        ListNodeI temp=  head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        if(head!=null)
        {
            System.out.println("end");

        }
    }

}

class ListNodeI{
    int val;
    ListNodeI next;
    
    ListNodeI(int val){this.val=val; this.next=null;}
    ListNodeI(int val,ListNodeI next){this.val=val; this.next=next;}

    public static void main(String[] args) {
        leetcodeQ3 list=new leetcodeQ3();
        list.insertLast(3);
        list.insertLast(63);
        list.insertLast(5);
        list.insertLast(7);
        list.insertLast(8);
        list.display();
        System.out.println("Is that a circular linkedList? "+list.hasCycle(list.head));
    }
    
}