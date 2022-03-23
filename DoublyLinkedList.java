package data.structure;

import org.w3c.dom.Node;

public class DoublyLinkedList {

    private NodeI head;
    private NodeI tail;
    private int size;


    public void addFirst(int val)
    {
      NodeI node=new NodeI(val);

      if (head==null)
      {
         head=node;
         tail=head;
         size++;

      }
      else {
          node.next = head;
          head.prev = node;
          head = node;
          size++;
      }

    }

    public void addLast(int val)
    {
        NodeI node=new NodeI(val);

        if (tail==null)
        {
            addFirst(val);
            return;

        }
        else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }

    }


    public void delFirst( )
    {

        if (head==null)
        {
            System.out.println("list is empty already  ");

        }
        else if(head.next==null)
        {
            head=null;
            tail=null;
            System.out.println("list is empty now");
            size--;
         }
        else {
            head=head.next;
            head.prev=null;

            size--;
        }

    }


    public void delLast( )
    {

        if (size<=1)
        {
            delFirst();
            return;
        }
        else
        {
            tail=tail.prev;
            tail.next=null;

            size--;
        }


    }

    public void insert(int index, int val)
    {

        if (index == 0) {
            addFirst(val);
        } else if (index == size) {
            addLast(val);
        } else {
            NodeI temp=head;
            for(int i=1; i<index; i++)
            {
                temp=temp.next;
            }
            NodeI node=new NodeI(val);
            node.next=temp.next;
            temp.next=node;
            node.prev=temp;
            if(node.next!=null) {
                node.next.prev = node;
            }
            size++;
        }
    }

    public void delete(int index)
    {

        if (index == 0) {
            delFirst( );
        } else if (index == size-1) {
            delLast( );
        } else {
            NodeI temp=head;
            for(int i=1; i<index; i++)
            {
                temp=temp.next;
            }

            temp.next=temp.next.next;
            if(temp.next.next!=null)
            temp.next.next.prev=temp;
            size--;
        }
    }

    public int find(int value)
    {
        int indexcount=0;
        NodeI node=head;
        while(head!=null)
        {
            indexcount++;

            if(node.value==value)
            {

                System.out.print("Element found At index : "+indexcount);
                System.out.println();
               System.out.print("Element   : ");

                return value;

            }
            else
                {
                    System.out.println("Element not found");
                    return -1;
            }
        }
        return value;
    }

    public void display()
    {
        NodeI temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
        if(head!=null)
        {
            System.out.println("end");

        }
    }

}


      class NodeI {

      int value;
      int size;
      NodeI next;
      NodeI prev;

    public NodeI(){this.size=0;}
    public NodeI(int val){this.value=val;}
    public NodeI(int val,NodeI next,NodeI prev){this.value=val; this.next=next; this.prev=prev;}

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(29);
        dll.addFirst(32);
        dll.addFirst(23);
        dll.delLast();
//        dll.delFirst();
//        dll.delFirst();
//        dll.delFirst();

        dll.insert(2,36);
        dll.insert(2,26);
        dll.delete(2);
        dll.delete(1);
        dll.display();
        System.out.println(  dll.find(23));
    }
}
