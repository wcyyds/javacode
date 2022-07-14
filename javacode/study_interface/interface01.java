package study_interface;
/*
继承和接口都存在的话，代码应该怎么写
extends关键字在前
implement关键字在后
 */
public class interface01 {
    public static void main(String[] args) {
        flyable f = new cat();//多态（     父类型引用转向子类型对象）
        f.fly();
    }
}
//动物：父类
class animal{

}
//可飞翔的接口
//能插拔的就是接口（）没有接口怎么插拔
//内存条查到主板上，他们之间有接口，内存条可以更换
//接口通常提取的是动作行为
interface flyable{
    void fly();
}

//动物类子类：猫类
//flyable就是一个接口，是一对翅膀，通工接口插到猫的身上，让猫变得可以飞翔
class cat extends animal implements flyable {
    public void fly() {
        System.out.println("肥猫起飞，敖翔太空的一只猫，很神奇，我想做一只猫");
    }
}

//动物类子类：蛇类
//你不想让他飞，就不给他插入这个接口，没有给蛇接口，蛇肯定不能飞
class snack extends animal{

}