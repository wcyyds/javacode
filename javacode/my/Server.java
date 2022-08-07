package my;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> socketList = new ArrayList<>();

    public void start(){

        try {
            ServerSocket serverSocket = new ServerSocket(007);
            System.out.println("sever is running at " + serverSocket.getLocalSocketAddress());
            //客户端一直监听
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "has connect to sever");
                socketList.add(socket);
                //启动服务端聊天的线程

                new Thread(new ServerThread(socket)).start();
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server().start();
    }

}
