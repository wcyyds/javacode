package duotai;
//这是没有使用多态机制，使mater的扩展力很低
//public class master{
//    public void feed(cat c){
//        c.eat();
//    }
//
//    public void feed(dog d){
//        d.eat();
//    }
//}

public class master {
    //主人的面向对象的是一个抽象的Pet,不面向具体的宠物
    //这样可以降低耦合度，提高代码的扩展力
    //这样就不用再mater类中创建，只需要新创建一个新的动物类就可以了
    public void feed (Pet pet){
        pet.eat();
    }
}
