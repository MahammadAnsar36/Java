// import java.util.*;
// class Crt{
// 	public static int crt(int a[],int m[],int n,int p){
// 		int x=0;
// 		for(int i=0;i<n;i++){
// 			int M=p/m[i];
// 			int y=0;
// 			for(int j=0;j<m[i];j++){
// 				if ((M*j)%m[i]==1) {
// 					y=j;
// 					break;
// 				}
// 			}
// 			x= x+a[i]*M*y;
// 		}
// 		return x%p;
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter n=");
// 		int size = sc.nextInt();
// 		System.out.println("Enter a:");
// 		int a[] = new int[size];
// 		for(int i=0;i<size;i++){
// 			a[i]=sc.nextInt();
// 		}
// 		System.out.println("Enter the m");
// 		int m[]=new int[size],p=1;
// 		for(int i=0;i<size;i++){
// 			m[i]=sc.nextInt();
// 			p=p*m[i];
// 		}
// 		System.out.println(crt(a, m, size, p));
// 	}
// }

// import java.util.Scanner;

// class Product{
// 	public static boolean binaryPalindrome(int x){
// 		int rev = 0;
// 		int orig = x;
// 		while (x>0) {
// 			rev=rev<<1;
// 			rev |=(x&1);
// 			x>>=1;
// 		}
// 		return rev==orig;
// 	}
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
// 		System.out.println(binaryPalindrome(x));
// 	}
//  }

import java.util.Scanner;

class Product{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int prod = 0;
		int n = Integer.toBinaryString(a).length();
		for(int i=0;i<n;i++){
			int curr = (a&1);
			if (curr==1) {
				prod=prod+b;
			}
			b<<=1;
			a>>=1;
		}
		System.out.println("result:"+prod);
	}
}