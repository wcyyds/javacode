package practise;

public class lianxia extends account{
    public static void main(String[] args) {
    C c = new C();
    c.dosome();

    }

}
class A{
    public void dosome(){
        System.out.println("DOSOME");
    }
}

class B extends A{
    public void doother(){
        System.out.println("doother");
    }
}

class C extends B{

}