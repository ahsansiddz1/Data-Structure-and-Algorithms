package data.structure;


class Solution   {
    ListNode head;
    ListNode tail;




    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        ListNode node = new ListNode(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }


    public void display(ListNode head  ) {

        ListNode temp = head;
         while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        if (head != null) {
            System.out.println("end");

        }
    }


    public  static   ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                 tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            } else {

                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;

            }
        }
        tail.next = (list1 != null) ? list1 : tail.next;
        tail.next = (list2 != null) ? list2 : tail.next;
         return dummyHead.next;
    }


}

public class ListNode   {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static void main(String[] args) {
        Solution list1 = new Solution();
        Solution list2 = new Solution();
        Solution a=new Solution();
//        ListNode s=a.head;
//        System.out.println(s.val);
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);

       ListNode h= Solution.mergeTwoLists(    list1.head ,  list2.head);
        a.display(h);
//        ListNode a =new ListNode();
//        Solution f=Solution.mergeTwoLists(list1, list2) ;
//        Solution.mergeTwoLists(list1, list2);
       // Solution h=    Solution.mergeTwoLists(list1,list2);
      //  Solution l=Solution.mergeTwoLists(list1,list2);

//         l.display(  ); // 3 2 1 4 3 1
//      Solution h=  Solution.mergeTwoLists(   list1,  list2);

//        ListNode l=Solution.mergeTwoLists(list1,list2);
        // Getting some errors.......

    }


    }
