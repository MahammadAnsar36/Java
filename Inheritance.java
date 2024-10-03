
class C{
    public void fun(){
        System.out.println("generic function");
    }
} 

class A extends C{
    void funclnA(){
        System.out.println("Function from A");
    }
}

class B extends C{

}

class D extends A{ 

}
public class Inheritance{
    public static void max (String[] args){
        A objA=new A();
        B objB=new B();
        D objD=new D();
        objA.fun();
        objB.fun();
        objD.fun();
        objD.funclnA();
    }
}
