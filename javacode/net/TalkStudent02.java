package net;

public class TalkStudent02 {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(2222,"localhost",8888)).start();
        new Thread(new TalkReceive(7777,"老师")).start();
    }
}
