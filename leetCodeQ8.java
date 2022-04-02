package data.structure;
//BUBBLE SORT USING RECURSION AND,
//REVERSAL OF LINKED LIST WHEN HEAD AND TAIL BOTH ARE GIVEN.
  class NodeB {

      NodeB next;

      int val;

    public NodeB(){}
    public NodeB(int val)
    {
        this.val=val;

    }
    public NodeB(int val,NodeB next)
    {
        this.val=val;
        this.next=next;
    }

    public static void main(String args[])
    {
        System.out.println();

        leetCodeQ8  list=new leetCodeQ8 ();

//        list.insertLast(95);
//        list.insertLast(34);
//        list.insertLast(32);
//        list.insertLast(24);
//        list.insertLast(44);
//        list.insertLast(54);
        for(int i=7; i>=1; i--)
        {
            list.insertLast(i);
        }
//        System.out.println("Before Sorting");
//        list.display();
//
//        list.bubblesort();
//        System.out.println("After Sorting");
//        list.display();

        //reverse of linked list
         list.display();
        list.reverse(list.head);
        list.display();

    }
}
class leetCodeQ8 {


    NodeB head;
    NodeB tail;

    private int size;

    public leetCodeQ8() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        NodeB node = new NodeB(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        NodeB node = new NodeB(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }


    //bubble sort
//
//    NodeB get(int index) {
//
//        NodeB temp=head;
//         for(int i=0; i<index; i++)
//        {
//            temp =  temp.next;
//        }
//
//        return temp;
//    }
//
//    void bubblesort()
//    {
//        bubblesort(size-1,0);
//    }
//
//       void bubblesort( int row, int col) {
//        if (row == 0) {
//            return;
//        }
//        if (col < row) {
//
//         NodeB first=get(col);
//         NodeB second=get(col+1);
//
//         if(first.val>second.val) {
//
//             if(first==head) {
//                head=second;
//                first.next=second.next;
//                second.next=first;
//             }
//             else if(second==tail) {
//                 NodeB prev=get(col-1);
//                 prev.next=second;
//                 tail=first;
//                 first.next=null;
//                 second.next=tail;
//             }
//             else {
//                 NodeB prev=get(col-1);
//                 prev.next=second;
//                 first.next=second.next;
//                 second.next=first;
//
//                  }
//
//           }
//            bubblesort( row, col+1);
//        }
//
//        else {
//                bubblesort( row-1, 0);
//             }
//
//    }

    //RECURSION REVERSE when head and tail is given
      void reverse(NodeB node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;

    }

    public void display() {
        NodeB temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        if (head != null) {
            System.out.println("end");

        }
    }

}