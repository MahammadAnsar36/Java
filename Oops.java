class Bankaccount{
    public String username;
     String password ;
}
class Calculator{
    int sum(int a,int b){

        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
class Student{
    String name;

    Student(String name){
        System.out.println("Constructor is called "+name);
        this.name = name;
    }
}

abstract class ANimal {
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
    
}
class Horse extends ANimal{
    void walk(){
        System.out.println("animal horse");
    }
}

class Fish extends ANimal{
    void walk(){
        System.out.println("Hi this is Fish");
    }
}


// Interface 
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonals");
    }
}
class GOW{
    GOW(){
        System.out.println("REalse in 2008");
    }
}
class GOW18 extends GOW{
    GOW18(){
        super();
        System.out.println("Realse in 2018");
    }
}
public class Oops {
    public static void main(String[] args) {
        // Bankaccount b = new Bankaccount();
        // b.username="mahammadansar";
        // b.password="nfokss";
        // // Student sc = new Student("ANsar");
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(3.4f, 4.5f));
        // System.out.println(cal.sum(3, 7, 9 ));
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Queen q = new Queen();
        // // q.moves();
        // GOW18 g = new GOW18();

    }
}
