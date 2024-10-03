import java.util.Arrays;

public class Array {
    public static void update(int marks[]){
        for (int i =0;i<marks.length;i++) {
            marks[i]=marks[i]+i;
        }
    }
    public static int getLargest(int marks[]){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (large<marks[i]) {
                large = marks[i];
            }
        }
        return large;
    }
    //Binary search
    public static int binarySearch(int marks[],int key){
        int start = 0 , end =marks.length-1;
        int mid =(start+end)/2;
        while (start <= end) {
            
            if (marks[mid]==key) {
                return mid;
            }
            if (marks[mid]<key) {
                start = mid+1;

            } else{
                end = mid-1;
            }return -1;
        }
        return -1;
    }
    public static void dul(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
    public static void pairs(int marks[]){
        int tp=0;
        for(int i =0;i<marks.length;i++){
            int cuur = marks[i];
            for(int j=i;j<marks.length;j++){
                System.out.print("("+cuur+","+marks[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void printSubarrays(int marks[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    currSum += marks[k];

                }
                System.out.println(currSum);
                if (maxsum<currSum) {
                    maxsum=currSum;
                }
               
            }
            
        }
        System.out.print(maxsum);
    }
    public static void remove(int arr[]){
        // int front = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        // arr.length=arr.length-1;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int marks[]={94,98,99,11};
        int arr[]={2,4,2,6,8,3,4,4};
        // pairs(marks);
        // update(marks);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i]+" ");
        // // } 
        // System.out.println(getLargest(marks));
        //System.out.println(binarySearch(marks, 9));
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(i+" ");
        // }
        // System.out.println(marks);
        // printSubarrays(marks);
        // dul(arr);
        remove(arr);
    }
}
