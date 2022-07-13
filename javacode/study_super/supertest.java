package study_super;

/*
总的总结：
super能出现在实例方法和构造方法中
super的语法是：super.和super()
super不能在静态方法中使用
super.在大部分情况下是可以省略的
super.在子类和父类中有同名属性的，或者说有同样的方法时，想要在子类中访问父类，super.不能省略
super()只能出现在构造方法第一行，通过当前的构造方法去调用父类中的构造方法，目的是：创建子类对象的时候，先初始化父类型特征
super的使用
1.super.属性名                   【访问父类的属性】
2.super.方法名（实参）            【访问父类的方法】
super（实参）                    【调用父类的构造方法】
 */



/*
super关键字
super和this对比这学习
this 只能出现在实例方法中和构造方法中，this. 或者this()
this不能使用在静态方法中
this.在大部分情况下是可以省略的，在区分局部变量和实例变量中是不能省略的
public void setname(String name)
{
    this.name = name;
}
this()只能出现在构造方法 第一行，通过当前的构造方法去调用本类中的其他构造方法，目的是：代码复用

super关键字
可以出现在实例方法和构造方法中，
语法是super. 和 super()
super不能使用在静态方法中
super.在大部分时候是可以省略的

super（）只能出现在构造方法的第一行，通过当前的构造方法去调用父类的构造方法，目的：创建子类对象的时候，先初始化父类型特征
super()
表示通过子类的构造方法调用父类的构造方法
模拟现实世界中的：要想有儿子，就要现有父亲

 4.重要结论：
 当构造犯法中第一行：
 既没有this()和super()的话，默认会有一个super()
 表示当前通过子类的构造方法调用父类的无参数构造方法，所以必须保重父类的无参数构造方发是存在的
 5.注意：
 super（）和this（）不能共存
 6.无论怎么样，父类的方法一定会执行

 7.  +在java语言中不管是new什么对象，最后的老祖宗的object类的无参构造方法一定会执行。
 （object类的无参构造方法是处于栈顶部的）
 */
public class supertest {
    public static void main(String[] args) {
        new B();
    }
}

class  A{
    public A(){
        System.out.println("A类的无参数构造方法");
    }
}

class B extends A{
    public B(){
        this("chenyang");
        System.out.println("B类的无参数构造方法");
    }

    public B(String name) {
        System.out.println("B类的有参数构造方法(String)");
    }
}
