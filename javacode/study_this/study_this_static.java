package study_this;

/*
 辨别this 和 static 的很好的东西。
 */
public class study_this_static {
    int i = 10;

    public static void some() {
        System.out.println("some");
    }

    public void other() {
        System.out.println("other");
    }

    //带static的方法
    public static void method1() {
        //调用some，完整的方式，省略的方式
        study_this_static.some();
        some();
        //调用other，完整的方式，省略的方式
        study_this_static fang01 = new study_this_static();
        fang01.other();
        //访问i，完整的方式，省略的方式
        System.out.println(fang01.i);

    }

    //不带static的方法
    public void method2() {
        //调用some，完整的方式，省略的方式
        study_this_static.some();
        //some();//错的
        //调用other，完整的方式，省略的方式
        this.other();
        other();
        //访问i，完整的方式，省略的方式
        System.out.println(this.i);
        System.out.println(i);
    }

    public static void main(String[] args) {
        //调用method1，用完整的方式，用省略的方式
        study_this_static.method1();
        method1();
        //调用method2，用完整的方式，用省略的方式
        study_this_static t = new study_this_static();
        t.method2();
    }
}
