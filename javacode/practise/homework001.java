package practise;
/*
编写一个java程序用于显示人的姓名和年龄
定义一个人类的person该类用过有两个私有属性的姓名name和年龄age
定义一个结构方法用来初始化数据域成员，在定义显示display方法将姓名和年龄打印出来
在main方法中创建人类的实例然后将信息显示
 */
public class homework001
{
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("王晨阳");
        p1.setAge(19);
        p1.display();

        person p2 = new person("张三",18);
        p2.display();
    }
}

class person{
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void display(){
        System.out.println("姓名" + this.getName() + "姓名" + this.getAge());
        System.out.println("姓名" + getName() + "姓名" + getAge());
        System.out.println("姓名" + this.name + "姓名" + this.age);
        System.out.println("姓名" + name + "姓名" + age);
    }
}