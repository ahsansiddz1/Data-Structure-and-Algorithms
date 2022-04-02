package data.structure;
// Question asked by Google,Microsoft,Apple and Amazon : https://leetcode.com/problems/reverse-linked-list/
//Reversal of linked list when only head is given.
class NodeC{
    NodeC next;
    int val;

    public NodeC(){}
    public NodeC(int val){this.val=val;}
    public NodeC(int val,NodeC next){this.val=val; this.next=next;}

    public static void main(String[] args) {
        NodeC list=new NodeC();
        leetCodeQ9 list1=new leetCodeQ9();
        for(int i=1; i<7; i++)
        {
            list1.insertLast(i);
        }
        list1.display();
        System.out.println();


       NodeC rv= list1.reverseList(list1.head);
     list1.head=rv;
        list1.display( );
    }
}
class leetCodeQ9{

     NodeC head;
     private int size;

    public leetCodeQ9() {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        NodeC node=new NodeC(val);

        if(head==null)
        {
          head=node;
          head.next=null;
          size++;
        }
        node.next=head;
        head.next=null;
         head=node;
        size++;
    }

    public void insertLast(int val)
    {
        NodeC node=new NodeC(val);
        NodeC temp=head;
        if(head==null)
        {
            insertFirst(val);
            return;
        }

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        size++;
    }

    public NodeC reverseList(NodeC head) {

        if(head==null)
        {
            return head;
        }

        NodeC prev=null;
        NodeC present=head;
        NodeC next=present.next;

        while(present !=null)
        {
             present.next=prev;
             prev=present;
             present= next;
           if(next!=null)
           {
               next=next.next;
           }
        }

        return prev;
    }
    public void display()
    {

        NodeC temp=head;
        while(temp !=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        if(head!=null)
        {
            System.out.print("END");
        }
    }

}