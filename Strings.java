// import java.util.Scanner;

import java.util.*;
public class Strings {
   public static void printLetters(int ame){
      String name = Integer.toString(ame);
      for(int i=name.length()-1; i>=0;i--){
         System.out.print(name.charAt(i));
      }
      System.out.println();
   }
   public static boolean isPalindrome(String str){
      for(int i=0;i<str.length()/2;i++){
         int n =str.length();
         if (str.charAt(i)!=str.charAt(n-i-1)) {
            return false;
         }
      }
      return true;
   }
   public static float getShortestPath(String path){
      int x=0, y=0;
      for(int i=0;i<path.length();i++){
         char dir = path.charAt(i);
         if (dir =='S') {
            y--;
         }
         else if (dir =='N') {
            y++;
         }
         else if (dir == 'W') {
            x--;

         }
         else{
            x++;
         }

      }
      int X2=x*x;
         int Y2=y*y;
         return (float)Math.sqrt(X2+Y2);
   }

 public static void main(String []args){
    Scanner sc  = new Scanner(System.in);
    int ame ;
    ame = sc.nextInt();
   //  System.out.println(name);
   printLetters(ame);

   // String str = "rawcecar";
   // System.out.println(isPalindrome(str)) ;

   // String path = "SSNEEWNNWWWNEENN";
   // System.out.println(getShortestPath(path));
   // String fruits[] ={"apple","mango","banana"};
   // String large = fruits[0];

   // for(int i=1;i<fruits.length;i++){
   //    if (large.compareTo(fruits[i])<0) {
   //       large=fruits[i];
   //    } 
   // }
   // System.out.println(large);
 }    
}
