package my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable{
    //服务器的地址和端口号
     private InetAddress serverIP;
     private int port;
    //创建socket连接
    Socket socket;
    //读取消息
    BufferedReader reader;
    //发送消息
    OutputStream os;

    public Client(InetAddress serverIP, int port) {
        this.serverIP = serverIP;
        this.port = port;

        try {
            socket = new Socket(serverIP ,port);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        while (true){
            try {
                String data = reader.readLine();
                os = socket.getOutputStream();
                os.write(data.getBytes());

                if(data.equals("bye")){
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
