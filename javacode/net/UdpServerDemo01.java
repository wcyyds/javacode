package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

//服务端,还是要等待客户端的链接
public class UdpServerDemo01 {

    public static void main(String[] args) throws IOException {
        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);
        //接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);//接收

        //阻塞接收,就是活着
        socket.receive(packet);

        //输出
        System.out.println(Arrays.toString(packet.getData()));

        //关闭链接
        socket.close();
    }
}
