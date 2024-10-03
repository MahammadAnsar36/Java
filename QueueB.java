// public class QueueB {
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear; 
//         Queue(int n){
//             arr=new int[n];
//             rear=-1;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;
//         }
//         public static void add(int data){
//             if (rear==size-1) {
//                 System.out.println("Queue if full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }
//         public static int remove(int arr[]){
//             if (isEmpty()) {
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i = 0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return front;
//         }
//         public static int peek(){
//             if (isEmpty()) {
//                 // return rear== -1;
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(6);
//         q.add(4);
//         q.add(3);
//     }
// }
/**
 * QueueB
 */
// public class QueueB {
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static class Queue{
//         public static Node head;
//         public static Node tail;
//         public static boolean isEmpty(){
//             return head==null&&tail==null;

//         }
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) { // Check if the queue is empty
//                 head = tail = newNode; // Both head and tail point to the new node
//             } else {
//                 tail.next = newNode; // Link the new node to the end of the queue
//                 tail = newNode; // Update the tail to the new node
//             }
//         }
//         public static int remove(){
//             if (isEmpty()) {
//                 return -1;
//             }
//             int formt = head.data;
//             if (head==tail) {
//                 head=tail=null;
//             } else{
//                 head=head.next;
//             }
//             return formt;

//         }
//         public static int peek(){
//             if (isEmpty()) {
//                 return -1;
//             }
//              return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q= new Queue();
//         q.add(9);
//         q.add(3);
//         q.add(5);
//     }
// }

// import java.util.LinkedList;
// import java.util.Queue;

/**
 * QueueB
 */
// public class QueueB {
//     public static class stack(){
//         static Queue<Integer> q1 = new Linkedlist<>();
//         static Queue<Integer> q2 = new Linkedlist<>();
//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void add(int data){
//             if (!q1.isEmpty()) {
//                 q1.add(data);
//             } else{
//                 q2.add(data);
//             }

//         }
//         public static int pop(){
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top=-1;
//             if (!q1.isEmpty()) {
//                 while (!q1.isEmpty()) {
//                     top=q1.remove();
//                     if (q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else{
//                 while (!q2.isEmpty()) {
//                     top=q2.remove();
//                     if (q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String[] args) {
//         stack s = new stack();
//         s.add(5);
//         s.add(3);
//         s.add(9);
//         while (!s.isEmpty()) {
//             s.pop();
//         }
//     }
// }
/**
 * QueueB
 */
import java.util.*;
// class QueueB {
//     public static void nonReatingnumber(String str) {
//         int freq[] = new int[26];
//         Queue<Character> q= new LinkedList<>();

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;
//             while (!q.isEmpty() && freq[q.peek()-'a']>1) {
//                 q.remove();
//             }

//             if (q.isEmpty()) {
//                 System.out.print(-1+" ");
//             } else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         String str="aabccxb";
//         nonReatingnumber(str);
//     }
// }
/**
 * QueueB
 */
public class QueueB {
    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(4);
        System.out.println(s.peek());
    }
}