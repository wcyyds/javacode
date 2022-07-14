package string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class unicode {
    public static void main(String[] args) {
        //子串
        String greeting = "hello";
        String s = greeting.substring(0, 3);
        System.out.printf("这是substring之后的单词 = %s\n", s);

        //拼接
        String friend = "my friend";
        String pinjie = greeting + friend;
        System.out.printf("这是拼接后的单词 = %s\n", pinjie);

        //多字符串拼接
        String many = String.join("*", greeting, friend, "how are you");
        System.out.println(many);

        //检测字符串是否相等
        String a = "wangchenyang";
        String b = "wangchenyang";
        String c = "wanghaoyang";
        String d = "wang";
        String e = "chenyang";
        String f = d + e;
        System.out.println(a.equals(b));//equals比较两个值的区别
        System.out.println(a.equals(c));
        System.out.println(a == b);//==比较的是两个地址，wangchenyang在两个对象中存储但是用的是一个内存的地址
        System.out.println(a == c);
        String g = f.intern();//这里是在方法区常量池中寻找是否有与f对应的字符串，如果有则返回true
        System.out.printf("**%b**", a == g);//%b是布尔类型的
        //System.out.println("**" + a == g + "**");//这是ln的表达，前面如果是字符串表达完了，后面就全是字符串了，所以表达不出来

        //字符输入和输出
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String firstname = in.nextLine();
        System.out.println(name + "****" + firstname);

        //Stringbuffer和Stringbuilder多用后者，前者效率稍低，但是允许多线程的的方式执行添加和删除字符串
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);

        System.out.println("---------------------");
        String word1[] = {"ab", "cd", "ef" };
        String word2 = "abcd";
        System.out.println(word1.length);
        System.out.println(word2.length());
    }
}