/**
 * Recursion
 */
public class Recursion {
    public static void printDec(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
        // printDec(n-1);
    }
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        // int fnm1 =fact(n-1);
        int fn = n*fact(n-1);
        // int fnm1 =fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if (n==0) {
            return 0;
        }
        // int fnm1 =fact(n-1);
        int fn = n+fact(n-1);
        // int fnm1 =fact(n-1);
        return fn;
    }
    public static int fib(int n){
        if (n==0||n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fibn= fnm1+fnm2;
        return fibn;
    }
    public static boolean issorted(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }

        return issorted(arr, i+1);
    }   
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        int xm1 = power(x, n-1);
        int xn=x*xm1;
        return xn;
    }
    public static int tilingProblem(int n){
        // base case 
        if (n==0||n==1) {
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        // int n =25;
        // System.out.println(fib(n));
        // int arr[] = {1,2,3,4,5};
        // System.out.println(issorted(arr, 0));
        // System.out.println(power(5, 4));
        System.out.println(tilingProblem(6));
    }
}