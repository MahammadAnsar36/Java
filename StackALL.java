// import java.util.*;

// public class StackALL {
//     //Using ArrayList Concept
//     // static class Stackb{
//     //    static ArrayList<Integer> list= new ArrayList<>();
//     //    public static boolean isemp(){
//     //     return list.size()==0;
//     //    }
//     //    //push
//     //    public static void push(int data){
//     //     list.add(data);
//     //    };
//     //    //pop
//     //    public static int pop(){
//     //     //corner case
//     //     if (isemp()) {
//     //         return -1;
//     //     }
//     //     int top=list.get(list.size()-1);
//     //     list.remove(list.size()-1);
//     //     return top;
//     //    }
//     //    //seek
//     //    public static int peek(){
//     //     if (isemp()) {
//     //         return -1;
//     //     }
//     //     return list.get(list.size()-1);
//     //    }
//     // using Linked list
//     // public class Stackb{
//     //     public static class Node{
//     //         int data;
//     //         Node next;
//     //         Node(int data){
//     //             this.data=data;
//     //             this.next=null;
//     //         }
//     //     }
//     //     static class Stack{
//     //         static Node head=null;
//     //         public static boolean isEmpty(){
//     //             return head ==null;
//     //         }
//     //         public static void push(int data){
//     //             Node newnode = new Node(data);
//     //             if(isEmpty()){
//     //                 head=newnode;
//     //                 return ;
//     //             }
//     //             newnode.next = head;
//     //             head = newnode;
//     //         }
//     //         public static int pop(){
//     //             if (isEmpty()) {
//     //                 return -1;
//     //             }
//     //             int top = head.data;
//     //             head=head.next;
//     //             return top;
//     //         }
//     //         public static int peek(){
//     //             if (isEmpty()) {
//     //                 return -1;
//     //             }
//     //             return head.data;
//     //         }

//     //     }
//     // }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(4);
//         s.push(6);
//         s.push(5);
//         s.push(2);
//         s.push(9);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }        
//     }
// }

import java.util.Stack;

/**
 * StackALL
 */
public class StackALL {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s, 4);
        reverseStack(s);
        printstack(s);
        

    }
}