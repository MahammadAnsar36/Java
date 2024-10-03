public class Pattrens {
    public static void hollow_Rect(int totrows,int totcols){
        for(int i = 1;i<=totrows;i++){
            for(int j = 1;j<=totcols;j++){
                if (i==1||i==totrows||j==1||j==totcols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
    
    }
    public static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_Rect(4, 7);
        star(7);
        num(6);
        rhombus(6);
    }
}