package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo01 {

    public static void main(String[] args) {
        InetAddress serverIP = null;
        int port = 0;
        Socket socket = null;
        OutputStream os = null;
        try {
            //要知道服务器的地址和端口号
            serverIP = InetAddress.getByName("127.0.0.1");
            port = 9999;
            //创建一个socket连接
            socket = new Socket(serverIP, port);
            //发送消息
            os = socket.getOutputStream();
            os.write("你好这是我发送的第一个消息".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
