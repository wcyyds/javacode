package javakaohe;
/*
public class testliaxi {
    public static void main(String[] args) {
        int num01 = 0;
        Outer outer = new Outer();
        outer.display(num01);
    }
}
class Outer{
    private int num = 5;
    public void display(int temp) {
    class inner{
        public void fun(){
            System.out.println(num);
            temp++;
            System.out.println(temp);
        }
    }
    }
}
class Inner{
    public void fun(){
        System.out.println(num);
        temp++;
        System.out.println(temp);
    }
}
*/

public class testliaxi{
    public static void main(String[] args) {
        Outer.method();
    }
}
interface Inner{
    void show();
}
class Outer {
    static void method() {

    }
}
