

///Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.


//Linked List Basics function implementation, backend structure.
//==================================================================================
//public  class pracLL {
//
//    Node head;
//    private int size;
//    pracLL()
//    {
//        this.size=0;
//    }
//
//   public class Node{
//
//       Node next;
//       String data;
//
//       Node(String data)
//       {
//           this.data=data;
//           this.next=null;
//       }
//   }
//
//  // =====>> add First
//
//        public void addFirst(String data)
//        {
//            size++;
//            Node newnode=new Node(data);
//            if(head==null)
//            {
//                head=newnode;
//                return;
//            }
//            newnode.next=head;
//            head=newnode;
//
//        }
//
//    // =====>> add last
//
//    public void addLast(String data)
//    {
//        size++;
//        Node newnode=new Node(data);
//        Node temp=head;
//        if(head==null)
//        {
//            head=newnode;
//            return;
//        }
//      while (temp.next!=null)
//      {
//          temp=temp.next;
//      }
//      temp.next=newnode;
//
//    }
//
//   // =====>> remove First
//
//    public void remFirst()
//    {
//
//        if(head==null)
//        {
//                return;
//        }
//       head=head.next;
//        size--;
//
//    }
// // =====>> remove last
//
//    public void remLast()
//    {
//        Node temp=head;
//
//        if(head==null)
//        {
//            return;
//        }
//        size--;
//        if(head.next==null)
//        {
//            head=null;
//            return;
//        }
//
//        while (temp.next.next!=null)
//        {
//            temp=temp.next;
//        }
//        temp.next=null;
//
//    }
//
//    private int getSize()
//    {
//        return size;
//    }
//
// // =====>> add element at specific index
//
//    public void addInMiddle(int index, String data) {
//        if(index > size || index < 0) {
//            System.out.println("Invalid Index value");
//            return;
//        }
//        size++;
//
//        Node newNode = new Node(data);
//        if(head == null || index == 0) {
//            newNode.next = head;
//            head = newNode;
//            return;
//        }
//        Node currNode = head;
//        for(int i=1; i<size; i++) {
//            if(i == index) {
//                Node nextNode = currNode.next;
//                currNode.next = newNode;
//                newNode.next = nextNode;
//                break;
//            }
//            currNode = currNode.next;
//        }
//    }
// //=====>> printing output
//    public void print( )
//        {
//            if(head==null)
//            {
//                System.out.println("list is empty");
//                return;
//            }
//            Node currNode=head;
//            while(currNode!=null)
//            {
//                System.out.print(currNode.data + "->");
//                currNode=currNode.next;
//            }
//            System.out.print("NULL");
//        }
//
//  //====> Main function
//
//    public static void main(String[] args) {
//
//        pracLL list=new pracLL();
//        list.addFirst("is");
//        list.addFirst("This");
//        list.addLast("a");
//        list.addLast("list");
////        list.remLast();
////        list.remLast();
////        list.remFirst();
////        list.remFirst();
////        list.remFirst();
////        list.remFirst();
////        list.remFirst();
//        list.addInMiddle(0,"ahsan");
//        list.print();
//        System.out.println();
//        System.out.println("Size of list : " + list.getSize());
//    }
//}

//=====================================================================================================
import java.util.Random;

class LinkedListProblems{

    Node head;
    private int size;

    LinkedListProblems()
    {
        this.size=0;
    }

    class Node{

         Node next;
         int data;

         Node(int data){
             this.data=data;
             this.next=null;
         }
    }

    private void addFirst(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    // Question 1 : Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
    // Search for the number 7 & display its index.

    private  void search(int element)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        boolean elementFound=false;
         for(int i=0; i<size; i++)
        {
              if(currNode.data==element)
            {
                System.out.println("Element found at node : " + (i+1));
                elementFound=true;
                break;
            }
            currNode=currNode.next;
        }
         if(!elementFound)
         {
             System.out.println();
             System.out.println("Element not found");
         }
    }
    // Question 2:
    // Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes
    // which have values greater than 25.

    public Node deleteGreaterthan25()
    {
        if(head == null) {
            System.out.println("Empty List ");
            return null;
        }

        Node temp=head;
         Node currNode=head;
        Node lastNode = head.next;

       while (lastNode!=null && currNode!=null)
        {
            if (currNode.data>25)
            {
                currNode=currNode.next;
                lastNode=lastNode.next;
                size--;
            }

           else if(lastNode.data>25)
            {
                while(lastNode.data>25){
                    size--;
                    lastNode=lastNode.next;
                }
                currNode.next=lastNode;
                currNode=currNode.next;
                lastNode=lastNode.next; //if error occurs in test case use this condition => if last node.nxt!=null

            }
           else{
               currNode=currNode.next;
               lastNode=lastNode.next;
            }

        }
        return temp;
    }


    //for printing output

    public void printList(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void printList(Node head){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedListProblems list=new LinkedListProblems();

        //Taking random inputs from 1 to 50
        Random rand = new Random();
        for(int i=1; i<=50; i++)
        {
            list.addFirst(rand.nextInt(50));
        }

       list.printList();

        list.search(7);

        Node i= list.deleteGreaterthan25();
        list.printList(i);

    }
}