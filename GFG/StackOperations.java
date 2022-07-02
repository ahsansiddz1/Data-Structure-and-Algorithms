import java.util.*;
//============
// Stack Implementation Using LinkedList
//============
//public  class StackOperations {
//
//   public static Node head;
//
//    static class Node{
//        Node next;
//        int data;
//        Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//
//    static class Stack{
//
//        public  boolean isEmpty(){
//                return head==null;
//        }
//
//        public void push(int data)
//        {
//            Node newNode=new Node(data);
//            if(isEmpty())
//            {
//                head=newNode;
//                return;
//            }
//            newNode.next=head;
//            head=newNode;
//        }
//        public int pop()
//        {
//            if(isEmpty())
//                return -1;
//
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//
//        public int peek()
//        {
//            if(isEmpty())
//                return -1;
//
//             return head.data;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Stack s =new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty())
//        {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}


//============
// Stack Implementation Using ArrayList
//============

 //
//public  class StackOperations {
//
//  static  ArrayList<Integer> list=new ArrayList<>();
//
//    static class Stack{
//
//        public  boolean isEmpty(){
//            return list.size()==0;
//         }
//
//        public void push(int data)
//        {
//            list.add(data);
//        }
//        public int pop()
//        {
//            if(isEmpty())
//                return -1;
//
//            int top=list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//
//        public int peek()
//        {
//            if(isEmpty())
//                return -1;
//
//            int top=list.get(list.size()-1);
//            return top;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Stack s =new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty())
//        {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

//============
// Stack Implementation Using Collection FrameWork
//============
//
//public  class StackOperations {
//
//    public static void main(String[] args) {
//
//        Stack<Integer> s=new Stack<>();
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty())
//        {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}
//======================
//===Push at the bottom of the stack
//==================
//
//public  class StackOperations {
//
//    public static void pushAtBottom(int data,Stack<Integer>s)
//    {
//        if(s.isEmpty())
//        {
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottom(data,s);
//        s.push(top);
//    }
//    public static void main(String[] args) {
//
//        Stack<Integer> s=new Stack<>();
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//         pushAtBottom(5,s);
//        while (!s.isEmpty())
//        {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}


//======================
//===Reverse the whole stack
//==================
//

public  class StackOperations {

    public static void pushAtBottom(int data,Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }

        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);

    }
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}