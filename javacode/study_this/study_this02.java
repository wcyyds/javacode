package study_this;

public class study_this02 {
    //姓名
    String name;
    //构造方法
    public study_this02(){

    }

    public void shopping(){
        System.out.println(this.name + "在购物");
        System.out.println(name + ">>" + "在购物");
        //由于name是一个实例变量，所以在有的时候访问的一定是当前对象的name
    }
    public static void dosome(){
        //错的System.out.println(this.name);
        //因为这个执行过程中没有“当前对象”，因为带有static的方法是通过类名的方式范文的
        //或者说这个上下文当中没有当前对象的，自然也不存在this
        study_this02 c = new study_this02();
        System.out.println(c.name);

    }
}
