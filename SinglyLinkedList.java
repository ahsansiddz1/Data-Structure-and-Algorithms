package data.structure;

//---------------------------------------------------------------------------------------------------------------------------------

    // MADE BY : AHSAN SIDDZ <<--->> ROLL NO : 19BSCS29

        // 1. For Inserting Element from head (insertFirst)
        // 2. For Deleting Element from head (insertLast)
        // 3. For Inserting Element from tail (delFirst)
        // 4. For Deleting Element from tail (delLast)
        // 5. Returns secondLast Index       get()
        // 6. For Inserting Element at specific Index
        // 7. For deleting Element from specific index
        // 8. For finding value of specific index
        // 9. Insert element at specific index using recursion (insusingrec)
        // 10. For Displaying LinkedList
//---------------------------------------------------------------------------------------------------------------------------------


public class SinglyLinkedList {

    private NodeI head;
    private NodeI tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
// 1. For Inserting Element from head

    public void insertFirst(int val) {
        NodeI node = new NodeI(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //---------------------------------------------------------------------------------------------------------------------------------
// 2. For Deleting Element from head
    public int delFirst() {
        int val = head.value;
        if (head == null) {
            tail = null;
            System.out.println("The List is Empty !");
        }
      else  if(head.next==null)
        {
            head=head.next;
            tail=null; // changes
            System.out.println("List is empty now");
            size--;
        }
      else {
            head = head.next;
            size--;
        }
            return val;

    }
    //---------------------------------------------------------------------------------------------------------------------------------
// 3. For Inserting Element from tail

    public void insertLast(int val) {
        NodeI node = new NodeI(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    //---------------------------------------------------------------------------------------------------------------------------------
// 4. For Deleting Element from tail
    public int delLast() {
        if (size <= 1) {
            delFirst();
            return 0;
        }
        else{
            NodeI secondLast = get(size - 2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null;
            return val;
        }


    }

    //---------------------------------------------------------------------------------------------------------------------------------
// 5. Returns secondLast Index
    public NodeI get(int index) {
        NodeI node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //---------------------------------------------------------------------------------------------------------------------------------
// 6. For Inserting Element at specific Index
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        } else if (index == size) {
            insertLast(val);
        } else {
            NodeI temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
                System.out.println("Run");
            }
            System.out.println(temp.next.value);
            NodeI node = new NodeI(val, temp.next);
            temp.next = node;
            size++;
        }

    }

    //---------------------------------------------------------------------------------------------------------------------------------

    // 7 For deleting Element from specific index

    public int delete(int index) {
        if (index == 0) {
            return delFirst();
        }

        else if (index == size - 1) {
            return delLast();
        }
        else {
            NodeI prev=get(index-1);
             int val= prev.next.value;
             prev.next=prev.next.next;

            return val;

        }
    }


    //---------------------------------------------------------------------------------------------------------------------------------
    //8.For finding value of specific index

    public NodeI find(int val)
    {
        NodeI node=head;

        while(node!=null)
        {
            if(node.value==val)
            {
                return node;
            }
            node=node.next;
        }
        return node;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
    // 9. Insert element at specific index using recursion
                                                        // 54 24 32 34 95
       public void insusingrec(int value,int index){    // 888 ->3rd INDEX
        head=insertRec(  value,  index,  head);         // 888 3 (54-node)
        }

       private NodeI insertRec(int value,int index,NodeI node)
       {
           if(index==0) //888 0 34
           {
               NodeI temp=new NodeI(value,node); // 888 (becomes current node)  34 (becomes next node)

               size++;
               return temp; // return node of 888


           }

           node.next=insertRec(value,index-1,node.next); // 888 2 24  // 888 1 32 // 888 0 34
           return node; //returns 54 (approaches to head)

//           54.next=(888,2,24) - > wait1
//           24.next=(888 1 32 ) -> wait2
//           32.next=(888 0 34) -> wait3
           //then "if(index==0)" condition satisfies - temp returns 888
           // 32.next = 888
           //24.next=32
           //54.next=24

       }
    //---------------------------------------------------------------------------------------------------------------------------------
    // 10. For Displaying LinkedList

    public void display(){
        NodeI temp=head;
         while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
         if(head!=null)
         {
             System.out.println("end");

         }
     }



    //---------------------------------------------------------------------------------------------------------------------------------
          //  MAIN FUNCTION CLASS
   //---------------------------------------------------------------------------------------------------------------------------------
    private class NodeI{
        private int value;
        private NodeI next;

        public NodeI(int value)
        {
            this.value=value;
        }
        public NodeI(int value,NodeI next)
        {
            this.value=value;
            this.next=next;
        }
    }
        public static void main(String args[])
        {
            System.out.println();

            SinglyLinkedList list=new SinglyLinkedList();

            System.out.print("Inserted 7 elements : ");
            list.insertFirst(95);
            list.insertFirst(34);
            list.insertFirst(32);
            list.insertFirst(24);
            list.insertFirst(54);
//            list.insertFirst(11);
//            list.insertFirst(30);
//            list.insertLast(29); //insert at tail
//            list.display();
//            System.out.print("Inserting element at 3rd index --->  ");
//            list.insert(100,2); // insert element at specific index
//            list.display();
//            list.delFirst(); //delete head element
//            list.delLast(); //delete tail element
            list.insusingrec(888,3);
            list.display();
//            list.delete(3); //Delete element of specific index
//            list.display();
//            System.out.println(list.find(44).value);  //CHECKING ELEMENT THAT IS IT BELONGS TO LINKEDLIST OR NOT
        }

}
