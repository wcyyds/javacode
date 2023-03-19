package henhaodeyinggai;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
//服务器
public class Server {
    public static List<Socket> socketList =new ArrayList<>();
    private void  start(){
        try {
            ServerSocket serverSocket = new ServerSocket(10086);
            System.out.println("server is running at "+serverSocket.getLocalSocketAddress());
            //监听客户端连接
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("["+socket.getRemoteSocketAddress()+"]has connected to server");
                socketList.add(socket);
                //启动服务端聊天线程
                new Thread(new ServerThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().start();//启动服务器
    }

}
