// import java.util.Scanner;

// public class Sum {
//     public static void allSum(int n){
//         int sum=0;
//         int v=0;
//         while (n>0) {
//             int r = n%10;
//             sum=sum+r;
//             n=n/10;
//          }
//         // System.out.println(sum);
//         while (sum>0) {
//             int l = sum%10;
//             v=v+l;
//             sum=sum/10;
//         }
//         System.out.println(v);
//         // allSum(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         allSum(n);
//     }
// }
import java.util.Scanner;

public class Sum {
    
    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    
    private static final String[] teens = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", 
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", 
        "sixty", "seventy", "eighty", "ninety"
    };
    
    private static final String HUNDRED = "hundred";

    private static String convertToWords(int n) {
        if (n == 0) {
            return "zero";
        }
        
        StringBuilder words = new StringBuilder();
        
        if (n >= 100) {
            words.append(units[n / 100]).append(" ").append(HUNDRED);
            n %= 100;
            if (n > 0) {
                words.append(" and ");
            }
        }
        
        if (n >= 20) {
            words.append(tens[n / 10]);
            n %= 10;
            if (n > 0) {
                words.append("-");
            }
        } else if (n >= 10) {
            words.append(teens[n - 10]);
            return words.toString();
        }
        
        if (n > 0) {
            words.append(units[n]);
        }
        
        return words.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 999: ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 999) {
            System.out.println("Please enter a valid number between 1 and 999.");
        } else {
           System.out.println( convertToWords(n));
        }
        
        scanner.close();
    }
}
