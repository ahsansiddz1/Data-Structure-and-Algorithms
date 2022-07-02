//
////Queue Implementation using array
//
//public class QueueOperations {
//
//    static class Queue{
//
//        static int[] arr;
//        static int size;
//        static int rear=-1;
//
//        Queue(int n){
//            arr=new int [n];
//            this.size=n;
//        }
//
//        //checking queue is empty or not
//        public boolean isEmpty(){
//            return rear==-1;
//        }
//
//        //enque
//        public void add(int data)
//        {
//            if(rear==size-1)
//            {
//                System.out.println("Queue is full");
//                return;
//            }
//            rear++;
//            arr[rear]=data;
//
//        }
//        //deque
//        time complexity : O(n)
//         public int remove()
//        {
//            if(rear==-1)
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int front=arr[0];
//            for (int i=0; i<rear; i++)
//            {
//                arr[i]=arr[i+1];
//            }
//            rear--;
//            return front;
//
//        }
//
//        public int peek()
//        {
//
//            if(rear==-1)
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//          return arr[0];
//        }
//    }
//    public static void main(String[] args) {
//        Queue q=new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty())
//        {
//            System.out.println(q.peek());
//            q.remove();
//
//        }
//
//
//
//    }
//}



//Circular Queue Implementation using array
//
//public class QueueOperations {
//
//    static class Queue{
//
//        static int[] arr;
//        static int size;
//        static int rear=-1;
//        static int front=-1;
//
//        Queue(int n){
//            arr=new int [n];
//            this.size=n;
//        }
//
//        //checking queue is empty or not
//        public boolean isEmpty(){
//            return rear==-1 && front==-1;
//        }
//
//        public boolean isFull(){
//            return (rear+1)%size==front;
//        }
//
//
//        //enque
//        public void add(int data)
//        {
//            if(isFull())
//            {
//                System.out.println("Queue is full");
//                return;
//            }
//            //1st element add
//            if(front==-1){front=0;}
//
//            rear= (rear+1)%size;
//            arr[rear]=data;
//
//        }
//        //deque
//        //time complexity : O(1)
//        public int remove()
//        {
//            if(isEmpty())
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int result=arr[front];
//            if(rear==front)
//            {
//                rear=front=-1;
//            }
//            else{
//                front=(front+1)%size;
//            }
//            return result;
//
//        }
//
//        public int peek()
//        {
//
//            if(isEmpty())
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[front];
//        }
//    }
//    public static void main(String[] args) {
//        Queue q=new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty())
//        {
//            System.out.println(q.peek());
//            q.remove();
//
//        }
//
//
//
//    }
//}

//Queue implementation using linkedList
//
//public class QueueOperations {
//
//    public static class Node {
//
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static class Queue{
//        static Node head = null;
//        static Node tail = null;
//
//        //checking queue is empty or not
//        public boolean isEmpty(){
//            return head==null & tail==null;
//
//        }
//
//
//        //enque
//        public void add(int data)
//        {
//            Node newNode=new Node(data);
//            if(tail==null)
//            {
//                tail=head=newNode;
//                return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//        }
//        //deque
//        //time complexity : O(1)
//        public int remove()
//        {
//            if(isEmpty())
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            //if there is only single element
//            if(head==tail)
//            {
//                tail=null;
//            }
//            int front=head.data;
//            head=head.next;
//            return front;
//
//        }
//
//        public int peek()
//        {
//
//            if(isEmpty())
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return head.data;
//        }
//    }
//    public static void main(String[] args) {
//        Queue q=new Queue( );
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty())
//        {
//            System.out.println(q.peek());
//            q.remove();
//
//        }
//
//
//
//    }
//}
//import java.util.*;
//
//     class QueueOperations{
//    public static void main(String[] args) {
//        Queue<Integer> q =new LinkedList<>() ;
//      //  Queue<Integer> q =new ArrayDeque<>() ;
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty())
//        {
//            System.out.println(q.peek());
//            q.remove();
//
//        }
//
//    }
//}

import java.util.Stack;

//=================================
//Queue Using Two Stacks
//=================================
class QueueOperations{

    static class Queue{
      static  Stack<Integer> s1=new Stack<>();
        static  Stack<Integer> s2=new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }

        }

        public static int remove()
        {
            if(s1.isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }
        public static int peek()
        {
            if(s1.isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
       Queue q =new Queue();
       q.add(1);
       q.add(2);
       while (!q.isEmpty())
       {
           System.out.println(q.peek());
           q.remove();
       }
    }
}