package data.structure;

public class leetcodeQ4 {

    //Google Question
    //   https://leetcode.com/problems/linked-list-cycle-ii/
    NodeK head;
    NodeK tail;

    public leetcodeQ4() {  }

    public void add(int val){
        NodeK node=new NodeK(val);
        NodeK s;

        if(head==null)
        {
            head=node;
            tail=node;
        }
        if(head.next==null)
        {
            tail.next=node;
            node.next=head;
            tail=node;
        }
       else if(head.next!=null && head.next.next==null)
        {
            tail.next=node;
            node.next=head;
            tail=node;
        }

        else if(head.next.next!=null && head.next.next.next==null)
        {
            tail.next=node;
            node.next=head;
            tail=node;
        }
        else{ ////cycle starts from 2nd index
              s=head.next.next;
            tail.next=node;
            node.next=s;
            tail=node;
         }
    }

    //-------------------------------------------------------------------------------------------------

    public boolean hasCycle(NodeK head) { //checking is that a circular linkedList or not <  timecomplexity=O(n) >
        NodeK fast=head;
        NodeK slow=head;
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

    public int lengthCycle(NodeK head) { //length of cycle
        NodeK fast=head;
        NodeK slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){ //for calculation just loop cycle length not the whole linkedlist length
                NodeK temp=slow;
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


    public NodeK detectCycle(NodeK head) { //finding the starting point of loop

        NodeK fast=head ;
        NodeK slow=head;
        int length=0;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=0;
                length=lengthCycle(slow);
                break;
            }

        }

        if(length==0)
        {
            return null;
        }
        //find start NodeK
        NodeK f=head;
        NodeK s=head;

        while (length>0){
            s=s.next;
            length--;
        }
        while(f!=s)
        {
            s=s.next;
            f=f.next;
        }
        return  s;
    }

    // display list

    public void display(){
        System.out.print(head.value+"->");
        System.out.print(head.next.value+"->");

        NodeK temp=head.next.next;
        if(head!=null){

            do{
                System.out.print(temp.value + "->");
                temp=temp.next;

            }
            while(temp!=head.next.next);
            System.out.print("LOOP TO INDEX 2 (234)");
         }
    }
}


class NodeK {

    int value;
    NodeK next;

    public NodeK(){ }
    public NodeK(int value){this.value=value;}
    public NodeK(int value,NodeK next){this.value=value; this.next=next;}


    public static void main(String[] args) {
        leetcodeQ4 CLL= new leetcodeQ4();
        CLL.add(13);
        CLL.add(233);
        CLL.add(234);
        CLL.add(44);
        CLL.add(29);

        CLL.display();
        System.out.println();
        if(CLL.head!=null)
            System.out.println("Is that a circular linkedList? "+CLL.hasCycle(CLL.head));
        else CLL.hasCycle(CLL.head);
        System.out.println("length of LOOP cycle : " + CLL.lengthCycle(CLL.head));

        NodeK v= CLL.detectCycle(CLL.head);
        System.out.println(" Starting Loop value :  "+v.value);
    }
}

