package practise;

public class lei {
    public static void main(String[] args) {
        //lei.some();
        some();
        lei t = new lei();
        t.other();
    }

    /**
     * 这是带有一个static的方法。
     * 后面有两个星星表示给方法注释，鼠标放到该方法上就有注释
     */
    public static void some() {
        System.out.println("do some");
    }

    public void other() {
        System.out.println("do other");
    }
}

