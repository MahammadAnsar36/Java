public class QueueY {
    public static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int [n];
            //this.size=n;
        }

        public static boolean isEmp(){
            return rear == -1;
        }

        // enqueue
        public static void add(int data){
            if (rear == size-1) {
                System.out.println("Full Queue");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        // dequeue
        public static int remove(){
            if (isEmp()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        
    }
}
