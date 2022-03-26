package data.structure;
//Amazon and Microsft Questions (included)
//https://leetcode.com/problems/linked-list-cycle/
public class circularLinkedList {
    Node head;
    Node tail;

    public circularLinkedList() {  }

    public void add(int val){
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
         }
        else{
             tail.next=node;
             node.next=head;
             tail=node;
          }
    }

    //-------------------------------------------------------------------------------------------------

    public void delete(int val){
     Node node=head;
        if(node==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==head && head.value==val)
        {
            head=null;
            tail=null;
            return;
        }
        else if(node.value==val)
        {
            tail.next=head.next;
            head=head.next;

         }
       else{
           do{
               Node n=node.next;

               if(n.value==val)
               {
                   node.next=n.next;
                    break;
               }
               node=node.next;

           }while(node!=head);

        }
    }
    public boolean hasCycle(Node head) { //checking is that a circular linkedList or not <  timecomplexity=O(n) >
        Node fast=head;
        Node slow=head;
if(head!=null) { //edge case
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            return true;
        }
    }
    return false;
}
else System.out.println(" --> List is empty so we can't predict about conclusions <-- ");
return false;
    }

    public int lengthCycle(Node head) { //length of cycle
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }
                while (temp!=slow);
                return length;

            }
        }
        return  0;
    }
    public void display(){
        Node temp=head;
       if(head!=null){

           do{
               System.out.print(temp.value + "->");
               temp=temp.next;
           }
           while(temp!=head);
           System.out.print("HEAD");
       }
    }
}


    class Node {

      int value;
       Node next;

    public Node(){ }
    public Node(int value){this.value=value;}
    public Node(int value,Node next){this.value=value; this.next=next;}


     public static void main(String[] args) {
         circularLinkedList CLL= new circularLinkedList();
         CLL.add(23);
         CLL.add(233);
         CLL.add(234);
         CLL.display();
         System.out.println();
         if(CLL.head!=null)
         System.out.println("Is that a circular linkedList? "+CLL.hasCycle(CLL.head));
        else CLL.hasCycle(CLL.head);
         System.out.println("length of cycle : " + CLL.lengthCycle(CLL.head));

     }
 }
