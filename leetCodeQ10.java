package data.structure;
// Question asked by Google,Microsoft,  and Facebook : https://leetcode.com/problems/reverse-linked-list-ii/
//Reversal of linked list in specific range.
class NodeD{
    NodeD next;
    int val;

    public NodeD(){}
    public NodeD(int val){this.val=val;}
    public NodeD(int val,NodeD next){this.val=val; this.next=next;}

    public static void main(String[] args) {
        NodeD list=new NodeD();
        leetCodeQ10 list1=new leetCodeQ10();
        for(int i=1; i<7; i++)
        {
            list1.insertLast(i);
        }
        list1.display();
        System.out.println();


        NodeD rv= list1.reverseBetween(list1.head,2,5);
        list1.head=rv;
        list1.display( );
    }
}
class leetCodeQ10{

    NodeD head;
    private int size;

    public leetCodeQ10() {
        this.size = 0;
    }

    public void insertFirst(int val)
    {
        NodeD node=new NodeD(val);

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
        NodeD node=new NodeD(val);
        NodeD temp=head;
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

//    public NodeD reverseList(NodeD head) {
//
//        if(head==null)
//        {
//            return head;
//        }
//
//        NodeD prev=null;
//        NodeD present=head;
//        NodeD next=present.next;
//
//        while(present !=null)
//        {
//            present.next=prev;
//            prev=present;
//            present= next;
//            if(next!=null)
//            {
//                next=next.next;
//            }
//        }
//
//        return prev;
//    }
    public NodeD reverseBetween(NodeD head, int left, int right) {

            if(left==right)
            {
                return head;
            }

            //skip the first left-1 node

        NodeD current=head;
        NodeD prev=null;

            for(int i=0; current!=null && i<  left-1; i++)
            {
                prev=current;
                current=current.next;
            }
            NodeD last=prev;
            NodeD newEnd=current;

            //Reverse between left and right.
        NodeD next=current.next;

        for(int i=0; current!=null && i<right-left+1; i++)
        {
            current.next=prev;
            prev=current;
            current= next;
            if(next!=null)
            {
                next=next.next;
            }

        }
           if(last!=null){
               last.next=prev;
           }else {
               head=prev;
           }
        newEnd.next=current;

        return head;
    }
    public void display()
    {

        NodeD temp=head;
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