
 
import java.util.*;

public class Stackclass {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmp(){
            return list.size() == 0;
        }
        //push 
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmp()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }


        //peek
        public static int peek(){
            if (isEmp()) {
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(3);
        // s.push(2);
        // System.out.println(s.peek());

    }
}



        

