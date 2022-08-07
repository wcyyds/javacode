package net;

public class TalkTeacher {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(1111,"localhost", 7777)).start();
        new Thread(new TalkReceive(8888,"学生")).start();
    }
}
