package study_super;
/*
对super举一个例子：在恰当上的时间使用：super(实际参数列表)
super,代表当前“对象的（this）”的“父类型特征”
super(实参)的作用就是：初始化当前对象的父类型特征，并不是创建一个新的对象，实际上对象只创建了一个
super关键字代表的就是当前对象的那部分父类型特正，继承了父亲的但是是在我身上的。
 */
public class supertest03 {
    public static void main(String[] args) {

        CreditAccount ca1 = new CreditAccount();
        System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCreditAc());
        CreditAccount ca2 = new CreditAccount("1111", 10000.0, 0.99);
        System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCreditAc());
    }
}

class Account{
    private String actno;
    private double balance;
    //无参的构造方法
    public Account(){

    }
    //有参的构造方法
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
    //setter和getter
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public String getActno() {
        return actno;
    }
}

class CreditAccount extends Account {
    //属性：信誉度
    //子类特有的一个特征，父类没有
    private double creditAc;

    //构造方法
    public CreditAccount(String actno, double balance, double credit){
        super(actno, balance);//调用父类的构造方法，给私有变量赋值
        this.creditAc = credit;
    }

    public CreditAccount() {

    }

    public double getCreditAc() {
        return creditAc;
    }
    public void setCreditAc(double creditAc) {
        this.creditAc = creditAc;
    }
}