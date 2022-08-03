package net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo02 {
//读取文件,文件发送
    public static void main(String[] args) {
        try {
            //服务器的地址和端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //创建一个socket链接
            Socket socket = new Socket(serverIP, port);
            //创建一个输入流
            OutputStream  os = socket.getOutputStream();

            //读取文件
            FileInputStream fis = new FileInputStream(new File("moyu.jpg"));
            //写出文件
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len=fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //通知服务器我已经结束了
            socket.shutdownOutput();//我已经传输完了



            //确定服务器接收完毕才能够断开连接
            InputStream inputStream = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer2 = new byte[1024];
            int len2 = 0;
            while ((len2 = inputStream.read(buffer2)) != -1) {
                baos.write(buffer2,0,len2);
            }
            System.out.println("****"+baos.toString());
            System.out.println("-------");


            //关闭资源
            fis.close();
            os.close();
            socket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
