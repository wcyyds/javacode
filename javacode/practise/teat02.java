package practise;

//参数的传递
public class teat02 {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);
        System.out.println("main-->" + u.age);
    }
    public static void add(User u) {
        u.age++;
        System.out.println("add->>" + u.age);
    }
}

class User {//这个是在堆内存开辟的空间
    int age;//实例变量

    public User(int i) {//构造方法
        age = i;
    }
}

/*先在栈内存中压栈main函数，然后再堆内存中分配user对象，再把堆内存中user的地址发给u,再在栈内存中压add函数，
  然后add函数给age加一，表达21，add函数完了，再回到main函数，再把age表达一遍，还是21.
 */