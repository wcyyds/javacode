package henhaodeyinggai;

import java.net.Socket;

public class Client3 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",10086);
            System.out.println("客户端3启动成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new SendThread(socket,"用户3")).start();
        new Thread(new RecevieThread(socket,"server")).start();
    }
}

