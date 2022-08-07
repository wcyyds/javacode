package henhaodeyinggai;

import java.io.IOException;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",10086);
            System.out.println("客户端2启动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new SendThread(socket,"用户2")).start();
        new Thread(new RecevieThread(socket,"server")).start();
    }
}

