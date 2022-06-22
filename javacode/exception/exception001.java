package exception;

import java.io.FileInputStream;

public class exception001 {
    private int a;

    public exception001(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        try{
            m1();
            System.out.println("try,xiamian");
        }catch(Exception t){
            System.out.println("异常捕捉");
        }
    }

    private static void m1() throws Exception {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    private static void m2() throws Exception {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 end");
    }

    private static void m3() throws Exception {
        new FileInputStream("D:\\");
        System.out.println("很明显这个不表达");
    }
}
