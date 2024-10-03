// import java.util.Scanner;

public class Linked_list {
    public static class Node{
        int data;
        Node next;
        int size;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if (head==tail) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    public static void addLast(int data){
        Node newnode=new Node(data);
        if (head==null) {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public static void print(){
        Node temp=head;
        if (head==null) {
            System.out.println("ll is empty");
            return;
        }
        
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
            
        }
        
        System.out.println("null");
    }
    public static void addMiddle(int idx,int data){
        Node newnode=new Node(data);
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        
        while(i<=idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static int itrSearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void reverse(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void delFromlast(int n){
        //cal size 
        Node temp=head;
        int sz=0;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;//remove first
        }
        int i=1;
        int iTOfind = sz-n;
        Node prev=head;
        while (i<iTOfind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
         
        while (fast!=null&&fast.next!=null) {
            slow = slow.next;//+1
            fast=fast.next.next;//+2
            if (slow==fast) {
                return true;//cycle exists
            }

        }
        return false;
    }
    public static void removeCycles(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                cycle=true;
                break;
            }
        }
        if (cycle==false) {
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;

        }
        //remove cycle
        prev.next=null;
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast =head.next;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }
    public Node mergeSort(Node head){
        if (head==null&&head.next==null) {
            return null;
        }
        Node mid=getMid(head);
        //left & right mergesort
        Node rightHead = mid.next;
        mid.next=null;
        //merge
        return mid;
        // return mergest(newLeft,newRight);
    }
    public static void main(String[] args) {
        // Linked_list ll = new Linked_list();
        // ll.addFirst(9);
        // ll.addFirst(4);
        // ll.addLast(66);
        // ll.addLast(32);
        // ll.addFirst(6);
        // ll.addMiddle(0, 7);
        // ll.print();
        // ll.reverse();
        // // ll.delFromlast(3);
        // // ll.print();
        // System.out.println(isCycle());
    }
}
