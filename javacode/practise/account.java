package practise;

public class account {
    private String actno;//账号
    private double balance;//余额
    //使用Alt+ins建构造get和set函数，方便快捷
    public account() {

    }

    public String getActno() {//这是
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
