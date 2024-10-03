// // public class prime {
    
// //     public static boolean isPrime(int n){
// //         // if(n==2){
// //         //   return true;
// //         // }
// //         boolean isprime = true;
// //         for(int i=2;i<=n-1;i++){
// //             if (n%i==0) {
// //                 return false;              
// //             }
// //         }
// //         return isprime;
// //     }
// //     public static void primeInRange(int n){
// //         for(int i=2;i<=n;i++){
// //             if (isPrime(i)) {
// //                 System.out.print(i+" ");
// //             }

// //         }
// //         System.out.println();
// //     }

// //     public static void main(String[] args) {
// //         primeInRange(118);
// //     }
// // }

// import java.util.Scanner;

// /**
//  * prime
//  */
// class GCD{
//     public static void gcdofThree(int a,int b,int c){
//         int max;
//         if (a>=b&&a>=c) {
//             max = a;
//         } else if(b>=a&&b>=c){
//             max = b;
//         }else{
//             max=c;
//         }
//         // int v=0;
//         // int  =0;
//         for(int i=max;i>=1;i--){
//             if (a%i==0&&b%i==0&&c%i==0) {
//                 System.out.println("the gcd = "+i);
//                 break;           
//             }
              
//         }
        
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         gcdofThree(a, b, c);
        
//     }
// }
import java.util.*;
public class gcd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt(); 
    System.out.println(factors(a, b, c));
    
    
  }
  static int findmin(int a,int b,int c){
    if(a<b&&a<c){
      return a;
    }else if(b<a&& b<c){
      return b;
    }else{
      return c;
    }
  }
  static int  factors(int a,int b,int c){
    ArrayList<Integer> al = new ArrayList<>();
    int i;
    for( i=1;i<=findmin(a, b, c);i++){
      if(a%i==0 && b%i==0 && c%i==0){
        al.add(i);
      }
    
      
    }
    int max=al.get(0);
    for(int j=1;j<al.size();j++){
      if(al.get(j)>max){
        max=al.get(j);
        
        
        

      }
    }
    
    return max;
  }
  
  

}