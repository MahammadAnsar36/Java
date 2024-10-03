// import java.util.*;
// public class Sts {
//     public static void printLetters(int a){
//        int org = a;
//        int rev=0;
//        while (a>0) {
//         rev=rev*10+a%10;
//         a=a/10;
//        }
//        if (rev==org) {
//         System.out.println("Palin");
//        }else{
//         System.out.println("not palin");
//        }
//      }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
        
//         printLetters(a);
//     }
// }
// public class Sts{
//     public static void count(int n){
//         int cou=0;
//         while (n>0) {
//             // int add=n%10;
//             n=n/10;
//             cou++;
//         }
//         System.out.println(cou);
//     }
//     public static void main(String []args){
//         int n=234513;
//         count(n);
//     }
// }
// public class Sts{
//     static void SegSieve(int l,int h)
//     {
//         //step1
//         boolean prime[] = new boolean[h + 1];
//         //step 2
//         for (int p = 2; p * p <= h; p++) {
//             int sm=(l/p)*p;
//             if (sm <l)
//             {
//                 sm=sm+p;
//             }
//             for (int i = sm; i <= h; i += p)
//                 prime[i] = true;
//             }
//             //step 3 Print all prime numbers
//         for (int i = l; i <= h; i++) 
//         {
//             if (prime[i] == false)
//                 System.out.print(i + " ");
//         }
//     }


//     public static void main(String args[]){
//         SegSieve(10, 30);
//     }
// }
// public class Sts{
//     public static void pattern(int n){
//         for(int i=1;i<=n;i++){
//             int col=0;
//             if (i>n/2) {
//                 col=n-i+1;
//             }else{
//                 col=i;
//             }
//             int spc=n/2-col;
//             for(int s=0;s<=spc;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=col;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         int n=11;
//         pattern(n);

//     }
// }
// public class Sts{
//     public static void main(String[] args) {
//         String s="Welcome to Complex";
//         String []r=s.split(" ");
//         for(int i=0;i<r.length;i++){
//             System.out.println(r[i]);
//         }
//     }
// }
// public class Sts{
//     public static void String(int n){
        
//         for(int i=1;i<=n;i++){
//             char a='A';
//             for(int j=1;j<=i;j++){
//                 System.out.print(a+" ");
//                 a++;   
//             }
            
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         char a='A';
//         int n=5;
//         String(n);
//     }
// }
public class Sts{
    public static void main(String[] args) {
        // int []arr= new int[17];
        String name="Sriram";
        // name="sahil";
        name.concat(" World");
        System.out.println(name);
    }
}