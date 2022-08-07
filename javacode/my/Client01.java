package my;

import java.net.Socket;

public class Client01 {
    public static void main(String[] args) {
        //服务器的地址和端口号
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",007);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        new Thread(new send(socket)).start();
//        new Thread(new Receiver(socket)).start();
    }
}
