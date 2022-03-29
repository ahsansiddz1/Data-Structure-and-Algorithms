package data.structure;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class leetcodeQ6 {


      NodeE head;
      NodeE tail;
    private int size;

    public leetcodeQ6() {
        this.size = 0;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
// 1. For Inserting Element from head

    public void insertFirst(int val) {
        NodeE node = new NodeE(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }


    //---------------------------------------------------------------------------------------------------------------------------------
// 3. For Inserting Element from tail

    public void insertLast(int val) {
        NodeE node = new NodeE(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

  public NodeE MiddleNode(NodeE head)
  {
      NodeE fast=head;
      NodeE slow=head;
      while(fast!=null && fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
      }
      return slow;
  }

    //---------------------------------------------------------------------------------------------------------------------------------
    // 10. For Displaying LinkedList

    public void display() {
        NodeE temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if (head != null) {
            System.out.println("end");

        }
    }
}



    //---------------------------------------------------------------------------------------------------------------------------------
    //  MAIN FUNCTION CLASS
    //---------------------------------------------------------------------------------------------------------------------------------
      class NodeE{

          int value;
          NodeE next;

        public NodeE(int value)
        {
            this.value=value;
        }
        public NodeE(int value,NodeE next)
        {
            this.value=value;
            this.next=next;
        }

    public static void main(String args[])
    {
        System.out.println();

        leetcodeQ6 list=new leetcodeQ6();

         list.insertLast(95);
        list.insertLast(34);
        list.insertLast(32);
        list.insertLast(24);
        list.insertLast(54);
        list.insertLast(54);
        list.display();
        NodeE m=list.MiddleNode(list.head );
        System.out.println("Middle Number is : " + m.value);
    }
    }


    
