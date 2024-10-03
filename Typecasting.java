// import java.util.Scanner;

public class Typecasting {
    public static int multiple(int a,int b){
        int product = a*b;
        return product;
    }
    // public static int factorial(int n){
    //     int f =1;
    //     for(int i=1; i<=n;i++){
    //         f=f*i;
    //     }
    //     return f;
    // }
    public static float factorial(float a,float b){
        return a+b;
    }
    // public static int binCoff(int n,int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);
    //     int biono = fact_n/(fact_r*fact_nmr);
    //     return biono;
    // }
    public static void main(String[] args) {
        System.out.println(factorial(5.30f,2.5f));
        // int x = 5;
        // int y = 8;
        // int pro= multiple(10,30);
        // System.out.println(pro);
        // factorial(6);
        // System.out.println(factorial(9));
        // System.out.println(binCoff(6, 3));
    }
}
