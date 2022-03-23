package data.structure;

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
     }
 }
