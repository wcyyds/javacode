package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServerDemo02 {
    //接收文件
    public static void main(String[] args) {
        //创建服务
        try {

            //创建服务
            ServerSocket serverSocket = new ServerSocket(9999);
            //监听客户端的链接
            Socket socket = serverSocket.accept();//阻塞监听,会一直等待客户端连接
            //获取输入流
            InputStream is = socket.getInputStream();

            //文件输出
            FileOutputStream fos = new FileOutputStream(new File("new.jpg"));
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }

            //通知客户端我接收完毕了
            OutputStream os = socket.getOutputStream();
            os.write("我接受完毕了,可以断开了".getBytes());


            //关闭资源
            fos.close();
            is.close();
            socket.close();
            serverSocket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
