package duotai;
//这个是一次测试数据

/**
 * 多态在实际开发中的应用
 * <p>
 * 1.分析：主人喂养宠物这个场景要实现需要进行类型的抽象
 * 主人【类】
 * 主人可以喂养宠物，所以主人要有喂养的动作
 * 宠物【类】
 * 宠物可以东西，所以宠物有吃这个动作
 */

//当一个类中并没有提供构造方法，系统会自动提供一个无参数的构造方法（缺省构造器）。
// 但是如果你构造了一个构造方法(无论有参没参），系统都不会再构造一个有无参数的构造方法。
public class test {
    public static void main(String[] args) {
        master zhangsan = new master();

        cat tom = new cat();
        zhangsan.feed(tom);

        dog erha = new dog();
        zhangsan.feed(erha);

        Pet p = new dog();
    }
}
