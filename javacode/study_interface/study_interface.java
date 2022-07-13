package study_interface;
/*
接口：
1.接口是一种引用数据类型
2.接口是完全抽象，（抽象类是半抽象类），或者说接口是特殊的抽象类
3.接口语法：
【修饰符列表】interface 接口名{}
4.接口支持多继承
5.接口中包含了两部分内容，一部分是：常量。一部分是：抽象方法。接口中没有其他内容了
6.接口中所有的元素都是public修饰
7.接口中的抽象方法的public abstract 是可以省略的
9.接口中的方法都是抽象方法，所以接口中的方法都不能有方法体
10.接口中的常量：public abstract final是可以省略的
 */



/*
1.类和类之间叫继承，类和接口之间叫实现，你仍然可以把实现看做继承
继承的使用用extends关键字完成
接口的使用用implement关键字完成
2.当一个非抽象类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖、重写）
 */
public class study_interface {
    public static void main(String[] args) {

    }
}
interface A{

}

interface B extends A {

}

interface C extends A,B {

}

interface  mymath002{
    //public abstract  int sum(int a, int b);//这个和去掉public abstract的那个等价，在接口中可以去掉
    int sum(int a, int b);

    //public static final double PI = 3.1415926;//这个和去掉的puf的那个等价，在接口中可以去掉
    double PI = 3.1415926;
}