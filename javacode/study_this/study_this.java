package study_this;

/*
this是一个关键字，翻译为：这个
this是一个引用，是一个变量，this变量中保存了自己的地址指向了自己，this存储在堆内存中
创建100个java对象，每个对象都有this,也就有100个不同的this
this不能使用在带有static的方法中
 */
public class study_this {
    public static void main(String[] args) {
        study_this02 c1 = new study_this02();
        c1.name = "zhangsan";
        c1.shopping();

        study_this02 c2 = new study_this02();
        c2.name = "chenyang";
        c2.shopping();

        //调用dosome方法（有static）
        //采用“类名.”的方式访问，显然这个方法在执行的过程中不需要对象参与
    }

}
