package net;

import java.net.*;

//客户端
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {
        //建立一个socket连接
        DatagramSocket socket = new DatagramSocket();
        //建个包
        String msg = "你好啊,服务器";
        //发送给谁呢
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        //数据,数据的长度起始,要发送给谁
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);
        //发送包
        socket.send(packet);
        //关闭流
        socket.close();
    }
}
