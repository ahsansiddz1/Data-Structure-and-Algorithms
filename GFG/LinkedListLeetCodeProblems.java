

import java.util.ArrayList;
import java.util.List;

class ListNode {

    Node head;
    private int size;

    ListNode() { this.size = 0; }

    private class Node {

        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Question 1
    ////https://leetcode.com/problems/swap-nodes-in-pairs/

     public Node swapPairs(Node head) {
        if(head==null || head.next==null)
        {
            return head;
        }
          Node newHead = head.next;
          Node temp = newHead.next;
          newHead.next = head;
          head.next = swapPairs(temp);
          return newHead;
    }

    //-----------------
    //Question 2
    //https://leetcode.com/problems/swap-nodes-in-pairs/
    public Node removeNthElement(Node head, int n) {
        if(head == null){
            return head;
        }

        List<Node> list = new ArrayList<>();
        Node tmp = head;
        while(tmp != null){
            list.add(tmp);
            tmp = tmp.next;
        }

        if(list.size() == 1 && n ==1){
            return null;
        }


        for(int i = list.size()-1 ; i >= 0 ; i--){ //removing the nth element
             if(n <=1){
                 list.remove(i);
                break;
            }
            n--;

        }

        for(int i = list.size()-1 ; i >=0  ; i--){// process last record
             if(i + 1>=list.size()){ //next of last element will be null
                list.get(i).next=null;
            }else{
                list.get(i).next= list.get(i+1);
            }

        }

        return list.get(0);
    }
//============================================================================

    //Remove nth Element from End
    Node removeNthFromEnd(Node head, int n) {
        if(head.next == null) {
            return null;
        }


        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //removing SIZEth node from last i.e. head
        if(n == size) {
            return head.next;
        }

        //find previous node
        int ptf = size - n; // position to find
        Node prev = head; // previous node
        int cp = 1; // current position

        while(cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }

//=========================================================================================================

    //Question 3
    // Reverse linked list from specific left to right position
    //https://leetcode.com/problems/reverse-linked-list-ii/
    public  Node reverseBetween(Node head, int left, int right) {

        if(head==null || head.next==null)
        {
            return head;
        }
        if (left == right) {

            return head;
        }

     Node newHead=head; //finding new head
     Node prevNewHead=head; //1 element before the newHead
    for(int i=1; i<left; i++)
       {
            prevNewHead=newHead;
           newHead=newHead.next;
       }


        Node newTail=head; //finding new tail
        for(int i=1; i<right; i++)
        {
            newTail=newTail.next;
        }
         Node newTailNext=newTail.next;  //one element ahead of new tail

        //reversing the list from newHead to newTail
        Node prevNode=newHead;
        Node currNode=newHead.next;
        while (currNode!=newTailNext)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        //Time to make Connections ;)

        if(newTailNext==null && newHead!=prevNewHead ) //mean we had traversed the list from newHead to oldTail
        {
            prevNewHead.next=prevNode;
            newHead.next=null;
            return head;
        }
        if(currNode==null ) //means we had traversed the whole linkedList
        {
            head.next=null;
            head=prevNode;
            return head;

        }
        else if(prevNewHead==newHead) ////mean we had  traversed the list from old head to newTail or oldTail
        {
             newHead.next=currNode;
             head=prevNode;
        }
    else //traversed the list from specific left to specific right (Left and right both are not an first and last element )
        {
             prevNewHead.next=prevNode;//
            newHead.next=currNode;
        }

        return head;

    }
    //=====================================================================
    // QUESTION 4
//    Time complexity - O(n)
//    Space complexity - O(1)
    public Node findMid(Node head)
    {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while (curr!=null)
        {
            Node nextNode=curr.next;
            curr.next=prev;

            //update
            prev=curr;
            curr=nextNode;
        }
//        prev.next=null;
//        head=prev;
        //return head;
        return prev;
    }
    public boolean isPalindrome(Node head) {

        if(head==null ||head.next==null)
            return true;


        Node firstHalfEnd=findMid(head);
        Node SecondHalfStart=reverse(firstHalfEnd.next);
        Node firstHalfStart=head;

        while (SecondHalfStart!=null)
        {
          
            if(firstHalfStart.data!=SecondHalfStart.data)
                return false;

                SecondHalfStart=SecondHalfStart.next;
                firstHalfStart=firstHalfStart.next;
        }
        return true;

    }
    //
//Detecting Loop in a Linked List.
//    Time complexity - O(n)
//    Space complexity - O(1)

    public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while (fast!=null && fast.next!=null  )
        {
            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow) {
                return true;
            }

        }
        return false;
    }

        void addFirst(int data)  //for adding the elements in linkedList from head
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    void addLast(int data)  //for adding the elements in linkedList from tail
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        else if(head.next==null)
        {
            head.next=newNode;
            return;
        }
        else {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }


    }


    void print()
    {
        if(head==null)
        {
            System.out.println("list is empty !!");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

}

public class LinkedListLeetCodeProblems {

    public static void main(String[] args) {
//        LinkedListLeetCodeProblems list=new LinkedListLeetCodeProblems();
        ListNode list=new ListNode();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(2);
        list.addLast(1);
//        list.addLast(4);
//        list.addLast(5);

        list.print();
        System.out.println();

//       list.head= list.swapPairs(list.head); //question 1
        //=======================
//        list.head= list.removeNthElement(list.head, 1); //question 2 part1
//        //=================
//        list.head= list.removeNthFromEnd(list.head, 1); //question 2 part2

//        list.print();

//       //question 3
//        list.head= list. reverseBetween( list.head, 1, 4);
//        list.print();

//        System.out.println(list.isPalindrome(list.head));
      //  System.out.println(list.hasCycle(list.head));




    }
}

