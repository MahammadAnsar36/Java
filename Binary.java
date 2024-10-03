public class Binary {
    public static void BinaryDeci(int binum){
        int num= binum;
        int dec= 0;
        int pow = 0;
        while (binum>0) {
            int lastdigit = binum%10;
            dec = dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binum = binum/10;
        }
    
        System.out.println("Decimal of "+ num+" is "+ dec);
    }
    public static void decTobin(int n){
        int Numn = n;
        int pow= 0;
        int binnum=0;
        while (n>0) {
            int rem = n%2;
            binnum = binnum +(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Form Decimal"+Numn+ "is "+binnum);
    }
    public static void main(String[] args) {
        BinaryDeci(10110);
        decTobin(99);
    }
}
